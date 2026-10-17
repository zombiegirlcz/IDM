package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.NumberlessCardView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.cz;
import ip0.dz;
import ip0.ez;
import ip0.fv;
import ip0.fz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0004\u0005\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NumberlessCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/dz;", "Lip0/fz;", "ip0/cz", "ip0/ez", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NumberlessCardDelegate extends BaseRecyclerViewDelegate<dz, fz> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52880c;
    public final e01.a d;

    public NumberlessCardDelegate(int i) {
        super(R$layout.internal_delegate_numberless_card, new fv(25));
        this.f52880c = i;
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fz(kotlin.jvm.internal.s.r(parent, this.f98535a), this.f52880c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
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
    public final void p(fz holder, dz data, int i, List payloads) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        NumberlessCardView numberlessCardView = holder.f;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.o(this, data, itemView);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                list = payloads;
                break;
            } else {
                if (!(payloads.get(i2) instanceof ez)) {
                    list = null;
                    break;
                }
                i2++;
            }
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        boolean zIsEmpty = list.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (Object obj2 : payloads) {
            if (obj2 instanceof ez) {
                boolean z29 = true;
                zIsEmpty = zIsEmpty || ((ez) obj2).f164164a;
                z = z || ((ez) obj2).f164165b;
                z3 = z3 || ((ez) obj2).f164166c;
                z6 = z6 || ((ez) obj2).d;
                z11 = z11 || ((ez) obj2).e;
                z4 = z4 || ((ez) obj2).f;
                if (!z12 && !((ez) obj2).f164167g) {
                    z29 = false;
                }
                z12 = z29;
            }
        }
        if (zIsEmpty) {
            numberlessCardView.setDetailsVisible(data.f163976a);
        }
        if (z) {
            numberlessCardView.setCardFrontImage(data.f163977b);
        }
        if (z3) {
            numberlessCardView.setCardBackImage(data.f163978c);
        }
        if (z4) {
            numberlessCardView.setCardBackOverlay(data.e);
        }
        if (z6) {
            numberlessCardView.setCustomisationImage(data.f);
        }
        if (z11) {
            cz czVar = data.d;
            numberlessCardView.setCardHolderName(czVar != null ? czVar.f163806a : null, czVar != null ? Integer.valueOf(czVar.f163807b) : null, czVar != null ? Integer.valueOf(czVar.f163808c) : null, czVar != null ? czVar.d : false);
        }
        if (z12) {
            if (data.f163979g) {
                numberlessCardView.b();
            } else {
                numberlessCardView.c();
            }
        }
        this.d.a(numberlessCardView.f56292c, holder);
    }
}
