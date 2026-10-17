package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e30;
import ip0.ic0;
import ip0.t90;
import ip0.uc0;
import ip0.vc0;
import ip0.w10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0004\u0005\u0002\u0006\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ScrollerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/hg;", "Lcom/revolut/core/ui_kit/delegates/ig;", "ip0/uc0", "ip0/jc0", "ip0/wc0", "ip0/xc0", "ip0/lc0", "ip0/vc0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollerDelegate extends BaseRecyclerViewDelegate<hg, ig> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f53279c;
    public final boolean d;
    public final koi.c e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f53280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f53281h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f53282j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerDelegate(List delegates, boolean z) {
        super(R$layout.internal_delegate_horizontal_scroller, new t90(20));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f53279c = delegates;
        this.d = z;
        this.e = new koi.c(delegates);
        this.f = v0.a.d("create(...)");
        this.f53280g = v0.a.d("create(...)");
        this.f53281h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f53282j = v0.a.d("create(...)");
        v0.a.d("create(...)");
    }

    public static final void p(ScrollerDelegate scrollerDelegate, RecyclerView recyclerView, vc0 vc0Var) {
        float width = (((recyclerView.getWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd()) / 2.0f) + recyclerView.getPaddingStart();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = recyclerView.getChildAt(i);
            float width2 = view.getWidth();
            if (width2 > BitmapDescriptorFactory.HUE_RED) {
                float right = (((view.getRight() + view.getLeft()) / 2.0f) - width) / width2;
                ls0.e eVar = (ls0.e) vc0Var;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                float fAbs = Math.abs(right);
                if (fAbs > 1.0f) {
                    fAbs = 1.0f;
                }
                float f = eVar.f199583a;
                float f4 = ((1.0f - f) * (1.0f - fAbs)) + f;
                view.setScaleX(f4);
                view.setScaleY(f4);
                view.setTranslationX((-Math.signum(right)) * (((1.0f - f4) * view.getWidth()) / 2.0f));
            }
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ig(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_horizontal_scroller));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        ig holder = (ig) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        xq0.c cVar = holder.f54303r;
        cVar.f.removeCallbacks(cVar.f308029g);
        cVar.d = false;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        ig holder = (ig) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        xq0.c cVar = holder.f54303r;
        cVar.f.removeCallbacks(cVar.f308029g);
        cVar.d = false;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ig) {
            ig igVar = (ig) holder;
            uc0 uc0Var = igVar.f54301p;
            RecyclerView recyclerView = igVar.f;
            if (uc0Var != null) {
                recyclerView.removeOnScrollListener(uc0Var);
            }
            igVar.f54301p = null;
            ic0 ic0Var = igVar.f54302q;
            if (ic0Var != null) {
                recyclerView.removeRecyclerListener(ic0Var);
            }
            igVar.f54302q = null;
            igVar.o = null;
        }
    }

    public final efm.r q() {
        efm.r map = this.f.doOnSubscribe(new e30(new w10(this, 13), 19)).filter(new e30(new ip0.za(18), 20)).map(new e30(new ip0.za(19), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0508  */
    /* JADX WARN: Type inference failed for: r2v14, types: [qv0.c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [qv0.c$e] */
    /* JADX WARN: Type inference failed for: r2v16, types: [qv0.c$e] */
    /* JADX WARN: Type inference failed for: r2v17, types: [qv0.c$a] */
    /* JADX WARN: Type inference failed for: r2v18, types: [qv0.c$a] */
    /* JADX WARN: Type inference failed for: r2v19, types: [qv0.c] */
    /* JADX WARN: Type inference failed for: r2v20, types: [qv0.c$f] */
    /* JADX WARN: Type inference failed for: r2v21, types: [qv0.c$f] */
    /* JADX WARN: Type inference failed for: r7v4, types: [qv0.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.ig r43, com.revolut.core.ui_kit.delegates.hg r44, int r45, java.util.List r46) {
        /*
            Method dump skipped, instruction units count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ScrollerDelegate.p(com.revolut.core.ui_kit.delegates.ig, com.revolut.core.ui_kit.delegates.hg, int, java.util.List):void");
    }
}
