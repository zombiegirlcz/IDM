package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.internal.views.AppTipView;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0004\u0003\u0002\b\tB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AppTipDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lip0/l1;", "Lip0/n1;", "", "<init>", "()V", "Companion", "ip0/m1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppTipDelegate extends BaseGroupRecyclerViewDelegate<ip0.l1, ip0.n1> {
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f51654g;

    public AppTipDelegate() {
        super(R$layout.internal_delegate_app_tip, new ip0.c(14));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f51654g = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.n1 n1Var = new ip0.n1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_app_tip));
        n1Var.f.f0();
        return n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void q(ip0.n1 holder, ip0.l1 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        AppTipView appTipView = holder.f;
        appTipView.setBoundModel(data.f165101b);
        final AppTipUIModel appTipUIModel = data.f165101b;
        boolean z = appTipUIModel.f57729h;
        aw0.p pVar = appTipUIModel.f;
        boolean z3 = z || pVar != null;
        boolean zIsEmpty = payloads.isEmpty();
        boolean zIsEmpty2 = payloads.isEmpty();
        boolean zIsEmpty3 = payloads.isEmpty();
        boolean zIsEmpty4 = payloads.isEmpty();
        boolean zIsEmpty5 = payloads.isEmpty();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.m1) {
                zIsEmpty = zIsEmpty || ((ip0.m1) obj2).f165297a;
                zIsEmpty2 = zIsEmpty2 || ((ip0.m1) obj2).f165298b;
                zIsEmpty3 = zIsEmpty3 || ((ip0.m1) obj2).f165299c;
                zIsEmpty4 = zIsEmpty4 || ((ip0.m1) obj2).d;
                zIsEmpty5 = zIsEmpty5 || ((ip0.m1) obj2).e;
            }
        }
        if (zIsEmpty) {
            appTipView.setLabel(appTipUIModel.f57726b);
        }
        if (zIsEmpty2) {
            appTipView.setTitle(appTipUIModel.f57727c);
        }
        if (zIsEmpty3) {
            appTipView.setSubtitle(appTipUIModel.d);
        }
        if (zIsEmpty4) {
            appTipView.setFooter(data.f165100a, pVar);
        }
        if (zIsEmpty5) {
            appTipView.setIcon(appTipUIModel.e);
        }
        final int i2 = 0;
        appTipView.setCloseIconClickListener(new View.OnClickListener(this) { // from class: ip0.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppTipDelegate f164775b;

            {
                this.f164775b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f164775b.f51654g.onNext(appTipUIModel);
                        break;
                    case 1:
                        this.f164775b.d.onNext(appTipUIModel);
                        break;
                    case 2:
                        this.f164775b.e.onNext(appTipUIModel);
                        break;
                    default:
                        this.f164775b.f.onNext(appTipUIModel);
                        break;
                }
            }
        });
        if (z3) {
            final int i3 = 1;
            appTipView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.j1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AppTipDelegate f164775b;

                {
                    this.f164775b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f164775b.f51654g.onNext(appTipUIModel);
                            break;
                        case 1:
                            this.f164775b.d.onNext(appTipUIModel);
                            break;
                        case 2:
                            this.f164775b.e.onNext(appTipUIModel);
                            break;
                        default:
                            this.f164775b.f.onNext(appTipUIModel);
                            break;
                    }
                }
            });
            final int i5 = 2;
            appTipView.setDetailsLinkClickListener(new View.OnClickListener(this) { // from class: ip0.j1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AppTipDelegate f164775b;

                {
                    this.f164775b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f164775b.f51654g.onNext(appTipUIModel);
                            break;
                        case 1:
                            this.f164775b.d.onNext(appTipUIModel);
                            break;
                        case 2:
                            this.f164775b.e.onNext(appTipUIModel);
                            break;
                        default:
                            this.f164775b.f.onNext(appTipUIModel);
                            break;
                    }
                }
            });
            final int i6 = 3;
            appTipView.setActionClickListener(new View.OnClickListener(this) { // from class: ip0.j1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AppTipDelegate f164775b;

                {
                    this.f164775b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            this.f164775b.f51654g.onNext(appTipUIModel);
                            break;
                        case 1:
                            this.f164775b.d.onNext(appTipUIModel);
                            break;
                        case 2:
                            this.f164775b.e.onNext(appTipUIModel);
                            break;
                        default:
                            this.f164775b.f.onNext(appTipUIModel);
                            break;
                    }
                }
            });
        } else {
            appTipView.setOnClickListener(null);
            appTipView.setDetailsLinkClickListener(null);
            appTipView.setActionClickListener(null);
        }
        appTipView.setClickable(z3);
    }
}
