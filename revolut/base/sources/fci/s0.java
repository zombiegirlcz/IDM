package fci;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurposeOfAccountTilesScreen f133810a;

    public s0(PurposeOfAccountTilesScreen purposeOfAccountTilesScreen) {
        this.f133810a = purposeOfAccountTilesScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = PurposeOfAccountTilesScreen.c0;
        this.f133810a.g3().c();
    }
}
