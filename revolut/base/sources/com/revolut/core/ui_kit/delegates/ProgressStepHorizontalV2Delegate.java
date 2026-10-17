package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.HorizontalProgressView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.a40;
import ip0.b40;
import ip0.c40;
import ip0.d40;
import ip0.e30;
import ip0.e40;
import ip0.f40;
import ip0.g40;
import ip0.h40;
import ip0.j40;
import ip0.k40;
import ip0.tz;
import ip0.w10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0003\u0002\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressStepHorizontalV2Delegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/a40;", "Lip0/j40;", "<init>", "()V", "Companion", "ip0/b40", "ip0/h40", "ip0/g40", "ip0/i40", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressStepHorizontalV2Delegate extends BaseRecyclerViewDelegate<a40, j40> {

    @NotNull
    private static final a Companion = new a();
    public static final Color.Solid d = new Color.Solid(R$attr.uikit_colorAccent);
    public static final Color.Solid e = new Color.Solid(R$attr.uikit_colorAccent_10);
    public static final Color.Solid f = new Color.Solid(R$attr.uikit_colorGreyTone20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52999c;

    public static final class a {
        private a() {
        }
    }

    public ProgressStepHorizontalV2Delegate() {
        super(R$id.internal_progress_step_horizontal_v2_delegate_type, new tz(29));
        this.f52999c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HorizontalProgressView horizontalProgressView = new HorizontalProgressView(context, null, 6, 0);
        horizontalProgressView.setId(R$id.uikit_horizontal_progress_view);
        horizontalProgressView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new j40(horizontalProgressView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void p(j40 holder, a40 data, int i, List list) {
        boolean z;
        boolean z3;
        Integer num;
        boolean z4;
        h40 h40Var;
        ms0.v0 v0Var;
        List list2;
        ms0.v0 v0Var2;
        ms0.u0 u0Var;
        boolean z6;
        boolean z11;
        Color.Solid solid;
        ms0.z0 w0Var;
        int i2;
        int i3;
        Color.Solid solid2;
        ?? r23;
        ms0.u0 u0Var2;
        List<b40> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            if (!(payloads.get(i6) instanceof b40)) {
                payloads = null;
                break;
            }
            i6++;
        }
        List list3 = payloads;
        boolean z12 = list3 == null || list3.isEmpty();
        boolean z29 = list3 == null || list3.isEmpty();
        boolean z31 = list3 == null || list3.isEmpty();
        if (payloads != null) {
            for (b40 b40Var : payloads) {
                z12 = z12 || b40Var.f163526a;
                z29 = z29 || b40Var.f163527b;
                z31 = z31 || b40Var.f163528c;
            }
        }
        HorizontalProgressView horizontalProgressView = holder.f;
        efm.r map = horizontalProgressView.c().map(new e30(new w10(data, 2), 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52999c.a(map, holder);
        if (z12) {
            List list4 = data.f163384b;
            List list5 = list4;
            ArrayList arrayList = new ArrayList(zhm.w.t(list5, 10));
            for (Object obj2 : list5) {
                int i21 = i5 + 1;
                if (i5 < 0) {
                    zhm.v.s();
                    throw null;
                }
                h40 h40Var2 = (h40) obj2;
                Object objE0 = zhm.d0.e0(i5 - 1, list4);
                h40 h40Var3 = (h40) zhm.d0.e0(i21, list4);
                h40 h40Var4 = (h40) objE0;
                Color.Solid solid3 = f;
                Color.Solid solid4 = d;
                if (h40Var4 != null) {
                    g40 g40Var = h40Var4.d;
                    z4 = z31;
                    if ((g40Var instanceof c40) || (g40Var instanceof d40) || (g40Var instanceof e40)) {
                        h40Var = h40Var4;
                        v0Var = new ms0.v0(solid3, ms0.u0.SOLID);
                    } else {
                        if (!(g40Var instanceof f40)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i22 = k40.f164957a[((f40) g40Var).f164190a.ordinal()];
                        h40Var = h40Var4;
                        if (i22 == 1) {
                            u0Var2 = ms0.u0.SOLID;
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u0Var2 = ms0.u0.DOTTED;
                        }
                        v0Var = new ms0.v0(solid4, u0Var2);
                    }
                } else {
                    z4 = z31;
                    h40Var = h40Var4;
                    v0Var = null;
                }
                if (h40Var3 == null) {
                    v0Var2 = null;
                    list2 = list4;
                } else {
                    g40 g40Var2 = h40Var2.d;
                    if ((g40Var2 instanceof c40) || (g40Var2 instanceof d40) || (g40Var2 instanceof e40)) {
                        list2 = list4;
                        v0Var2 = new ms0.v0(solid3, ms0.u0.SOLID);
                    } else {
                        if (!(g40Var2 instanceof f40)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i32 = k40.f164957a[((f40) g40Var2).f164190a.ordinal()];
                        list2 = list4;
                        if (i32 == 1) {
                            u0Var = ms0.u0.SOLID;
                        } else {
                            if (i32 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u0Var = ms0.u0.DOTTED;
                        }
                        v0Var2 = new ms0.v0(solid4, u0Var);
                    }
                }
                String str = h40Var2.f164504a;
                ?? r72 = h40Var2.f164505b;
                g40 g40Var3 = h40Var2.d;
                boolean z41 = g40Var3 instanceof e40;
                if (z41) {
                    z6 = z41;
                    z11 = z29;
                    solid = new Color.Solid(R$attr.uikit_colorGreyTone50);
                } else {
                    z6 = z41;
                    z11 = z29;
                    solid = new Color.Solid(R$attr.uikit_colorForeground);
                }
                Object obj3 = h40Var2.f164506c;
                if (g40Var3 instanceof c40) {
                    w0Var = new ms0.y0(v0Var, v0Var2);
                } else if (g40Var3 instanceof d40) {
                    w0Var = new ms0.x0(v0Var, v0Var2);
                } else if (g40Var3 instanceof f40) {
                    w0Var = new ms0.w0(solid4, v0Var, v0Var2);
                } else {
                    if (!z6) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w0Var = new ms0.w0(solid3, v0Var, v0Var2);
                }
                ms0.z0 z0Var = w0Var;
                int size2 = data.f163384b.size();
                if (size2 == 2 || size2 == 3) {
                    if (h40Var != null) {
                        i2 = h40Var3 == null ? 5 : 3;
                        solid2 = solid;
                        r23 = obj3;
                        i3 = 1;
                    }
                    i3 = i2;
                    solid2 = solid;
                    r23 = obj3;
                } else {
                    solid2 = solid;
                    r23 = obj3;
                    i3 = 1;
                }
                arrayList.add(new com.revolut.core.ui_kit.internal.views.d(str, r72, solid2, r23, z0Var, i3));
                i5 = i21;
                z31 = z4;
                list4 = list2;
                z29 = z11;
            }
            z = z31;
            z3 = z29;
            horizontalProgressView.setSteps(arrayList);
        } else {
            z = z31;
            z3 = z29;
        }
        if (z3 && (num = data.f163385c) != null) {
            horizontalProgressView.scrollToPosition(num.intValue());
            Unit unit = Unit.f186387a;
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
