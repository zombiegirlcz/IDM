package com.onfido.android.sdk.capture.utils.listeners;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.onfido.android.sdk.capture.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/listeners/ActivityTitleSetterFragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "()V", "onFragmentViewCreated", "", "fm", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ActivityTitleSetterFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(@NotNull FragmentManager fm3, @NotNull Fragment fragment, @NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm3, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewWithTag = view.findViewWithTag(fragment.getString(R.string.onfido_tag_main_content_title));
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (viewFindViewWithTag instanceof TextView) {
            TextView textView = (TextView) viewFindViewWithTag;
            CharSequence contentDescription = textView.getContentDescription();
            fragmentActivityRequireActivity.setTitle((contentDescription == null || contentDescription.length() == 0) ? textView.getText() : textView.getContentDescription());
        } else {
            if (viewFindViewWithTag != null && viewFindViewWithTag.getContentDescription() != null) {
                fragmentActivityRequireActivity.setTitle(viewFindViewWithTag.getContentDescription());
                return;
            }
            if (fragmentActivityRequireActivity instanceof AppCompatActivity) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) fragmentActivityRequireActivity;
                if (appCompatActivity.getSupportActionBar() != null) {
                    ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
                    appCompatActivity.setTitle(supportActionBar != null ? supportActionBar.getTitle() : null);
                }
            }
        }
    }
}
