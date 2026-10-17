package hg0;

import com.revolut.core.model.faq.FaqNode;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import knd.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.y;
import zhm.d0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eg0.a f152059a;

    public m(eg0.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f152059a = repository;
    }

    public static FaqNode a(FaqNode faqNode, boolean z) {
        if (!z || (faqNode instanceof FaqNode.Article) || (faqNode instanceof FaqNode.Deeplink)) {
            return faqNode;
        }
        if (faqNode instanceof FaqNode.Category) {
            FaqNode.Category category = (FaqNode.Category) faqNode;
            List list = category.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                b.Companion.getClass();
                if (a.f152042b.contains(((FaqNode) obj2).getF51432c())) {
                    arrayList.add(obj2);
                }
            }
            return FaqNode.Category.a(category, arrayList);
        }
        if (!(faqNode instanceof FaqNode.Topic)) {
            throw new NoWhenBranchMatchedException();
        }
        FaqNode.Topic topic = (FaqNode.Topic) faqNode;
        List list2 = topic.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            b.Companion.getClass();
            if (a.f152042b.contains(((FaqNode) obj3).getF51432c())) {
                arrayList2.add(obj3);
            }
        }
        return FaqNode.Topic.a(topic, arrayList2);
    }

    public static List f(String str, List list) {
        List listF;
        Iterator it8 = list.iterator();
        List listF0 = null;
        while (it8.hasNext()) {
            FaqNode faqNode = (FaqNode) it8.next();
            if (Intrinsics.f(faqNode.getF51434a(), str)) {
                listF0 = u.c(faqNode);
            } else {
                if ((faqNode instanceof FaqNode.Article) || (faqNode instanceof FaqNode.Deeplink)) {
                    listF = null;
                } else if (faqNode instanceof FaqNode.Category) {
                    listF = f(str, ((FaqNode.Category) faqNode).d);
                } else {
                    if (!(faqNode instanceof FaqNode.Topic)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listF = f(str, ((FaqNode.Topic) faqNode).e);
                }
                listF0 = listF != null ? d0.F0(faqNode, listF) : null;
            }
            if (listF0 != null) {
                return listF0;
            }
        }
        return listF0;
    }

    public final y b(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return rd0.e.d(new ayf.h(new g0(new g(zi0.c.w(((eg0.h) this.f152059a).d(false)), this, key, 0), new d4f.m(2, 24, null), 1), this, z, 2), h0.f322473a);
    }

    public final y c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return rd0.e.d(new exe.j(new g(zi0.c.w(((eg0.h) this.f152059a).d(false)), this, key, 1), 14), h0.f322473a);
    }

    public final wkm.l d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        eg0.h hVar = (eg0.h) this.f152059a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        r rVarX = efm.d0.D(hVar.f125517b.b(), hVar.f125516a.a(), new ed7.e(new eed.a(5), 14)).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return q.Q(rd0.e.b(rVarX), new a32.b((Continuation) null, hVar, key, 29));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b0 -> B:40:0x00dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cd -> B:36:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.m.e(java.lang.String, gim.c):java.io.Serializable");
    }
}
