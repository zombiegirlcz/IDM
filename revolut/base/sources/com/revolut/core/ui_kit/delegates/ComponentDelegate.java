package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import mx0.z4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0012\b\u0001\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0006:\u0005\u0007\n\u000b\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ComponentDelegate;", "", "ComponentModel", "Landroid/view/View;", "Lmx0/z4;", "Component", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lip0/cc;", "Lip0/ec;", "Companion", "ip0/dc", "ip0/wb", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComponentDelegate<ComponentModel, Component extends View & mx0.z4> extends BaseGroupRecyclerViewDelegate<ip0.cc, ip0.ec> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final LinkedHashMap f = new LinkedHashMap();
    public final Function1 d;
    public final e01.a e;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ComponentDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ComponentDelegate(KClass componentType, Function1 createView) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        jij.m rule = jij.m.f174586a;
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(createView, "createView");
        INSTANCE.getClass();
        LinkedHashMap linkedHashMap = f;
        Object objValueOf = linkedHashMap.get(componentType);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(View.generateViewId());
            linkedHashMap.put(componentType, objValueOf);
        }
        super(((Number) objValueOf).intValue(), new ip0.lb(4));
        this.d = createView;
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ec(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_view_wrapper), this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        ip0.ec holder = (ip0.ec) bVar;
        ip0.cc data = (ip0.cc) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        View view = holder.f;
        mx0.z4 z4Var = (mx0.z4) view;
        efm.r map = z4Var.a().map(new ip0.a9(new ii4.b(data, 29), 17));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.e.a(map, holder);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.dc)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.dc dcVar = (ip0.dc) payloads.get(i3);
            zIsEmpty = zIsEmpty || dcVar.f163868b;
            z = z || dcVar.f163867a;
        }
        if (zIsEmpty) {
            z4Var.setModel(data.f163710b);
        }
        if (z) {
            ip0.bc childWidth = data.f163711c;
            Intrinsics.checkNotNullParameter(childWidth, "childWidth");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (childWidth instanceof ip0.zb) {
                layoutParams2.width = -1;
            } else {
                if (!(childWidth instanceof ip0.ac)) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutParams2.width = -2;
                layoutParams2.gravity = ((ip0.ac) childWidth).f163417a.a();
            }
            view.setLayoutParams(layoutParams2);
        }
    }
}
