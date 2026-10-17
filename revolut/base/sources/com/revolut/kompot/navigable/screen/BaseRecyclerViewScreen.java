package com.revolut.kompot.navigable.screen;

import aii.r;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import java.util.List;
import jj2.a;
import jki.n;
import jki.o;
import jo0.g;
import koi.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o31.b;
import yhm.d;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljki/n;", "UI_STATE", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class BaseRecyclerViewScreen<UI_STATE extends n, INPUT_DATA extends IOData$Input, OUTPUT_DATA extends r> extends BaseScreen<UI_STATE, INPUT_DATA, OUTPUT_DATA> {
    public final int M;
    public RecyclerView N;
    public final int O;
    public RecyclerView.LayoutManager P;
    public final boolean Q;
    public final boolean R;
    public Parcelable S;
    public final Object T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerViewScreen(IOData$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_recycler_view;
        this.O = R$id.recyclerView;
        this.Q = true;
        this.R = true;
        this.T = j.c(k.NONE, new a(this, 4));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Parcelable parcelable = this.S;
        if (parcelable != null) {
            RecyclerView.LayoutManager layoutManager = this.P;
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(parcelable);
            } else {
                Intrinsics.r("layoutManager");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(getO());
        if (recyclerView == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(": recyclerViewId is not valid. Forgot to override?"));
        }
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.N = recyclerView;
        RecyclerView recyclerViewH = h();
        h hVarD3 = d3();
        hVarD3.f.b(getG0());
        recyclerViewH.setAdapter(hVarD3);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RecyclerView.LayoutManager layoutManagerA3 = a3(context);
        Intrinsics.checkNotNullParameter(layoutManagerA3, "<set-?>");
        this.P = layoutManagerA3;
        recyclerViewH.setLayoutManager(layoutManagerA3);
        if (((Boolean) g.f176839y.getValue()).booleanValue()) {
            RecyclerView.ItemAnimator itemAnimator = recyclerViewH.getItemAnimator();
            if (Intrinsics.f(itemAnimator != null ? itemAnimator.getClass() : null, DefaultItemAnimator.class)) {
                RecyclerView.ItemAnimator itemAnimator2 = recyclerViewH.getItemAnimator();
                Intrinsics.i(itemAnimator2, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
                ((DefaultItemAnimator) itemAnimator2).setSupportsChangeAnimations(false);
            }
        } else {
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            recyclerViewH.setItemAnimator(defaultItemAnimator);
        }
        recyclerViewH.addItemDecoration(new b());
        recyclerViewH.addItemDecoration(new s31.b());
        gki.j jVar = y2().f98425m;
        if (jVar != null) {
            if (((uji.b) jVar).a(gki.b.f144401a) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public void Y2() {
        if (getR()) {
            RecyclerView.LayoutManager layoutManager = this.P;
            if (layoutManager != null) {
                this.S = layoutManager.onSaveInstanceState();
            } else {
                Intrinsics.r("layoutManager");
                throw null;
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public void Z2(n uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().c(uiState.c());
    }

    public RecyclerView.LayoutManager a3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(context);
        uIKitLinearLayoutManager.f98539c = true;
        return uIKitLinearLayoutManager;
    }

    /* JADX INFO: renamed from: b3, reason: from getter */
    public boolean getQ() {
        return this.Q;
    }

    /* JADX INFO: renamed from: c3 */
    public abstract List getG0();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public h d3() {
        return (h) this.T.getValue();
    }

    /* JADX INFO: renamed from: e3, reason: from getter */
    public int getO() {
        return this.O;
    }

    /* JADX INFO: renamed from: f3, reason: from getter */
    public boolean getR() {
        return this.R;
    }

    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public int getM() {
        return this.M;
    }

    public final RecyclerView h() {
        RecyclerView recyclerView = this.N;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("recyclerView");
        throw null;
    }
}
