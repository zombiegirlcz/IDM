package v8d;

import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.top_level.TopLevelFaqScreenContract$InputData;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import x8d.a;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TopLevelFaqScreenContract$InputData f286743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x8d.a f286744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k18.c f286745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f286746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f286747t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, TopLevelFaqScreenContract$InputData inputData, x8d.a topLevelFaqExtension, k18.c faqProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topLevelFaqExtension, "topLevelFaqExtension");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        this.f286743p = inputData;
        this.f286744q = topLevelFaqExtension;
        this.f286745r = faqProvider;
        List list = inputData.f86306a;
        this.f286746s = new e(new Data(list, null, list == null, 2, null));
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Boolean.FALSE);
        this.f286747t = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        if (this.f286743p.f86306a == null) {
            Continuation continuation = null;
            yji.l.a1(this, q.Q(this.f286747t, new uec.d(continuation, this, 17)), null, null, new v44.e(this, continuation, 11), 3);
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f286746s;
    }

    public final void y2(FaqNodeBase faqNodeBase) {
        this.f286744q.g3(faqNodeBase);
        Object obj2 = a.AbstractC1686a.b.f303314a;
        if (!obj2.equals(obj2)) {
            if (!obj2.equals(a.AbstractC1686a.C1687a.f303313a)) {
                throw new NoWhenBranchMatchedException();
            }
            v2(new f(faqNodeBase.getF51434a()));
            return;
        }
        if (faqNodeBase instanceof FaqNode) {
            FaqNode faqNode = (FaqNode) faqNodeBase;
            if (faqNode instanceof FaqNode.Deeplink) {
                return;
            }
            if (faqNode instanceof FaqNode.Article) {
                v2(new g(faqNode));
                return;
            } else if (faqNode instanceof FaqNode.Category) {
                v2(new h(faqNode));
                return;
            } else {
                if (!(faqNode instanceof FaqNode.Topic)) {
                    throw new NoWhenBranchMatchedException();
                }
                v2(new h(faqNode));
                return;
            }
        }
        if (!(faqNodeBase instanceof PigeonNode)) {
            throw new NoWhenBranchMatchedException();
        }
        PigeonNode pigeonNode = (PigeonNode) faqNodeBase;
        int i = l.f286742a[pigeonNode.f51436c.ordinal()];
        if (i == 1) {
            v2(new h(pigeonNode));
        } else if (i == 2) {
            v2(new g(pigeonNode));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            r6.b.D("'DEEPLINK' type is not supported");
        }
    }

    public final void z2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (obj2 instanceof FaqNode.Category) {
            y2((FaqNodeBase) obj2);
            return;
        }
        if (obj2 instanceof PigeonNode) {
            y2((FaqNodeBase) obj2);
        } else if (Intrinsics.f(itemId, "ERROR_STATE_ID")) {
            n2(new uxe.l(this, null, 12), new whi.b(6));
        }
    }
}
