package com.onfido.android.sdk.capture.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import au0.b2;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentBulletedMessageBinding;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.utils.StringExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b'\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0002\b\u0014Jm\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u0011*\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0002J\f\u0010&\u001a\u00020\u0011*\u00020\u0004H\u0002J\u0016\u0010'\u001a\u00020\u0011*\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0017H\u0002J\u0014\u0010)\u001a\u00020\u0011*\u00020\u00042\u0006\u0010*\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006,"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/BulletedMessageFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentBulletedMessageBinding;", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentBulletedMessageBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onNextClicked", "v", "onNextClicked$onfido_capture_sdk_core_release", "setInfo", "requestKey", "", "title", "subtitle", "bullets", "", "isSubtitleLarge", "", "isWithoutListHeader", "infoText", "topIconRes", "", "topIconContentDescription", "setInfo$onfido_capture_sdk_core_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "addBullets", "adjustStepsContainerTopMargin", "applyTopIconContentDescription", "description", "setupTopIcon", "arguments", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BulletedMessageFragment extends BaseFragment {
    private OnfidoFragmentBulletedMessageBinding _binding;

    @NotNull
    private static final String INFO_PARAM = "INFO_LARGE";

    @NotNull
    private static final String SUBTITLE_PARAM = "SUBTITLE";

    @NotNull
    private static final String REQUEST_KEY_PARAM = "REQUEST_KEY";

    @NotNull
    private static final String TOP_ICON_PARAM = "TOP_ICON";

    @NotNull
    private static final String SUBTITLE_LARGE_PARAM = "SUBTITLE_LARGE";

    @NotNull
    private static final String TOP_ICON_CONTENT_DESCRIPTION_PARAM = "TOP_ICON_CONTENT_DESCRIPTION";

    @NotNull
    private static final String BULLETS_LIST_PARAM = "BULLETS_LIST";

    @NotNull
    private static final String TITLE_PARAM = "TITLE";

    @NotNull
    private static final String WITHOUT_LIST_HEADER_PARAM = "WITHOUT_LIST_HEADER";

    private final void addBullets(OnfidoFragmentBulletedMessageBinding onfidoFragmentBulletedMessageBinding, List<String> list) {
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Context context = onfidoFragmentBulletedMessageBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BulletStepView bulletStepView = new BulletStepView(context, null, 0, 6, null);
            bulletStepView.setPadding(0, 0, 0, bulletStepView.getContext().getResources().getDimensionPixelSize(R.dimen.onfido_bullets_margin_vertical));
            bulletStepView.setStepInfo(i2, (String) obj2);
            bulletStepView.setIcon(R.drawable.onfido_arrow_forward_white);
            bulletStepView.hideSeparators();
            onfidoFragmentBulletedMessageBinding.stepsContainer.addView(bulletStepView);
            i = i2;
        }
    }

    private final void adjustStepsContainerTopMargin(OnfidoFragmentBulletedMessageBinding onfidoFragmentBulletedMessageBinding) {
        int dimension = (int) (getResources().getDimension(R.dimen.onfido_proof_of_address_margin_top) / getResources().getDisplayMetrics().density);
        LinearLayout stepsContainer = onfidoFragmentBulletedMessageBinding.stepsContainer;
        Intrinsics.checkNotNullExpressionValue(stepsContainer, "stepsContainer");
        ViewGroup.LayoutParams layoutParams = stepsContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimension, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        stepsContainer.setLayoutParams(marginLayoutParams);
        onfidoFragmentBulletedMessageBinding.getRoot().requestLayout();
    }

    private final void applyTopIconContentDescription(OnfidoFragmentBulletedMessageBinding onfidoFragmentBulletedMessageBinding, String str) {
        ImageView imageView;
        int i;
        if (StringExtensionsKt.isNotNullOrEmpty(str)) {
            onfidoFragmentBulletedMessageBinding.topIcon.setContentDescription(str);
            imageView = onfidoFragmentBulletedMessageBinding.topIcon;
            i = 1;
        } else {
            imageView = onfidoFragmentBulletedMessageBinding.topIcon;
            i = 2;
        }
        imageView.setImportantForAccessibility(i);
    }

    public static /* synthetic */ void setInfo$onfido_capture_sdk_core_release$default(BulletedMessageFragment bulletedMessageFragment, String str, String str2, String str3, List list, boolean z, boolean z3, String str4, Integer num, String str5, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInfo");
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        bulletedMessageFragment.setInfo$onfido_capture_sdk_core_release(str, str2, str3, list, z, z3, str4, num, str5);
    }

    private final void setupTopIcon(OnfidoFragmentBulletedMessageBinding onfidoFragmentBulletedMessageBinding, Bundle bundle) {
        int i;
        int i2 = bundle.getInt("TOP_ICON", 0);
        if (i2 != 0) {
            onfidoFragmentBulletedMessageBinding.topIcon.setImageResource(i2);
            ImageView topIcon = onfidoFragmentBulletedMessageBinding.topIcon;
            Intrinsics.checkNotNullExpressionValue(topIcon, "topIcon");
            ViewExtensionsKt.toVisible$default(topIcon, false, 1, null);
            applyTopIconContentDescription(onfidoFragmentBulletedMessageBinding, bundle.getString("TOP_ICON_CONTENT_DESCRIPTION"));
            i = R.dimen.onfido_welcome_scroll_view_margin_top;
        } else {
            ImageView topIcon2 = onfidoFragmentBulletedMessageBinding.topIcon;
            Intrinsics.checkNotNullExpressionValue(topIcon2, "topIcon");
            ViewExtensionsKt.toGone$default(topIcon2, false, 1, null);
            i = R.dimen.onfido_welcome_title_top_margin;
        }
        TextView title = onfidoFragmentBulletedMessageBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        ViewGroup.LayoutParams layoutParams = title.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = getResources().getDimensionPixelSize(i);
        title.setLayoutParams(marginLayoutParams);
    }

    @NotNull
    public final OnfidoFragmentBulletedMessageBinding getBinding() {
        OnfidoFragmentBulletedMessageBinding onfidoFragmentBulletedMessageBinding = this._binding;
        Intrinsics.h(onfidoFragmentBulletedMessageBinding);
        return onfidoFragmentBulletedMessageBinding;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        OnfidoFragmentBulletedMessageBinding onfidoFragmentBulletedMessageBindingInflate = OnfidoFragmentBulletedMessageBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(onfidoFragmentBulletedMessageBindingInflate, "inflate(...)");
        this._binding = onfidoFragmentBulletedMessageBindingInflate;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("TITLE");
            String string2 = arguments.getString("SUBTITLE");
            boolean z = arguments.getBoolean("SUBTITLE_LARGE");
            String string3 = arguments.getString("INFO_LARGE");
            boolean z3 = arguments.getBoolean("WITHOUT_LIST_HEADER");
            onfidoFragmentBulletedMessageBindingInflate.title.setText(string);
            onfidoFragmentBulletedMessageBindingInflate.subtitle.setText(string2);
            setupTopIcon(onfidoFragmentBulletedMessageBindingInflate, arguments);
            if (z) {
                onfidoFragmentBulletedMessageBindingInflate.subtitle.setTextSize(2, getResources().getDimension(R.dimen.onfido_fs_body_regular) / getResources().getDisplayMetrics().density);
            }
            if (z3) {
                adjustStepsContainerTopMargin(onfidoFragmentBulletedMessageBindingInflate);
            }
            List<String> stringArrayList = arguments.getStringArrayList("BULLETS_LIST");
            if (stringArrayList == null) {
                stringArrayList = f0.f322471a;
            }
            addBullets(onfidoFragmentBulletedMessageBindingInflate, stringArrayList);
            if (StringExtensionsKt.isNotNullOrEmpty(string3)) {
                TextView infoTextView = onfidoFragmentBulletedMessageBindingInflate.infoTextView;
                Intrinsics.checkNotNullExpressionValue(infoTextView, "infoTextView");
                ViewExtensionsKt.toVisible$default(infoTextView, false, 1, null);
                onfidoFragmentBulletedMessageBindingInflate.infoTextView.setText(string3);
            } else {
                TextView infoTextView2 = onfidoFragmentBulletedMessageBindingInflate.infoTextView;
                Intrinsics.checkNotNullExpressionValue(infoTextView2, "infoTextView");
                ViewExtensionsKt.toGone$default(infoTextView2, false, 1, null);
            }
            onfidoFragmentBulletedMessageBindingInflate.next.setOnClickListener(new b2(this, 6));
        }
        return onfidoFragmentBulletedMessageBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    public void onNextClicked$onfido_capture_sdk_core_release(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        String string = requireArguments().getString("REQUEST_KEY");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullExpressionValue(string, "requireNotNull(...)");
        getParentFragmentManager().setFragmentResult(string, Bundle.EMPTY);
    }

    public final void setInfo$onfido_capture_sdk_core_release(@NotNull String requestKey, @NotNull String title, @NotNull String subtitle, @NotNull List<String> bullets, boolean isSubtitleLarge, boolean isWithoutListHeader, String infoText, Integer topIconRes, String topIconContentDescription) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        Bundle bundle = new Bundle();
        bundle.putString("REQUEST_KEY", requestKey);
        bundle.putStringArrayList("BULLETS_LIST", new ArrayList<>(bullets));
        bundle.putString("TITLE", title);
        bundle.putString("SUBTITLE", subtitle);
        bundle.putBoolean("SUBTITLE_LARGE", isSubtitleLarge);
        bundle.putBoolean("WITHOUT_LIST_HEADER", isWithoutListHeader);
        bundle.putString("INFO_LARGE", infoText);
        bundle.putInt("TOP_ICON", topIconRes != null ? topIconRes.intValue() : 0);
        bundle.putString("TOP_ICON_CONTENT_DESCRIPTION", topIconContentDescription);
        setArguments(bundle);
    }
}
