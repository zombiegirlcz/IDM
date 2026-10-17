package nw3;

import al4.q;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import elm.f;
import ft3.h1;
import hs3.v;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import nk9.l;
import p24.g;
import p24.p;
import skm.e0;
import skm.p0;
import tqh.j;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f219761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f219762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u24.a f219763c;
    public final p d;

    public d(w revolutJobInteractor, q creditInteractor, u24.a comboCardOrderingRepository, p repository) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        Intrinsics.checkNotNullParameter(comboCardOrderingRepository, "comboCardOrderingRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f219761a = revolutJobInteractor;
        this.f219762b = creditInteractor;
        this.f219763c = comboCardOrderingRepository;
        this.d = repository;
    }

    public static String a(PluginPayload pluginPayload) {
        Object obj2;
        String str;
        it3.d dVar = pluginPayload.f66247a;
        v vVar = dVar.e;
        if (!(vVar instanceof hs3.q)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.q) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
            }
            obj2 = (hs3.q) vVar;
        }
        hs3.q qVar = (hs3.q) obj2;
        return (qVar == null || (str = qVar.e) == null) ? pluginPayload.f66247a.f168330m : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        if (c(r8, false, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        if (c(r8, true, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.credit.application.models.plugins.PluginPayload r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof nw3.b
            if (r0 == 0) goto L13
            r0 = r9
            nw3.b r0 = (nw3.b) r0
            int r1 = r0.f219757x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219757x = r1
            goto L18
        L13:
            nw3.b r0 = new nw3.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219757x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            com.revolut.feature.credit.application.models.plugins.PluginPayload r8 = r0.u
            yhm.o.b(r9)
            goto La4
        L36:
            yhm.o.b(r9)
            it3.d r9 = r8.f66247a
            hs3.v r2 = r9.e
            boolean r5 = r2 instanceof hs3.q
            r6 = 0
            if (r5 == 0) goto L4f
            if (r2 == 0) goto L47
            hs3.q r2 = (hs3.q) r2
            goto L6d
        L47:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata"
            r8.<init>(r9)
            throw r8
        L4f:
            java.util.List r9 = r9.f
            if (r9 == 0) goto L6c
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L59:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r9.next()
            boolean r5 = r2 instanceof hs3.q
            if (r5 == 0) goto L59
            goto L69
        L68:
            r2 = r6
        L69:
            hs3.v r2 = (hs3.v) r2
            goto L6d
        L6c:
            r2 = r6
        L6d:
            hs3.q r2 = (hs3.q) r2
            if (r2 == 0) goto L73
            hs3.o1 r6 = r2.f154930b
        L73:
            r9 = -1
            if (r6 != 0) goto L78
            r2 = r9
            goto L80
        L78:
            int[] r2 = nw3.a.f219755a
            int r5 = r6.ordinal()
            r2 = r2[r5]
        L80:
            if (r2 == r9) goto L99
            if (r2 == r4) goto L8d
            if (r2 != r3) goto L87
            goto L99
        L87:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L8d:
            r0.u = r8
            r0.f219757x = r4
            r9 = 0
            java.lang.Object r9 = r7.c(r8, r9, r0)
            if (r9 != r1) goto La4
            goto La3
        L99:
            r0.u = r8
            r0.f219757x = r3
            java.lang.Object r9 = r7.c(r8, r4, r0)
            if (r9 != r1) goto La4
        La3:
            return r1
        La4:
            it3.d r8 = r8.f66247a
            java.lang.String r8 = r8.f168323a
            mri.w r9 = r7.f219761a
            mri.w.r0(r9, r8)
            pw5.a.w(r9)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.d.b(com.revolut.feature.credit.application.models.plugins.PluginPayload, gim.c):java.lang.Object");
    }

    public final Object c(PluginPayload pluginPayload, boolean z, b bVar) throws Throwable {
        if (z) {
            String strA = a(pluginPayload);
            if (strA != null) {
                ((nzl.a) this.f219761a).d(0L, strA);
            }
        } else {
            String strA2 = a(pluginPayload);
            if (strA2 != null) {
                Object objD = d(3, 500L, new l(this, strA2, null, 10), bVar);
                if (objD == fim.a.COROUTINE_SUSPENDED) {
                    return objD;
                }
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (skm.k0.b(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0095 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r8, long r9, nk9.l r11, gim.c r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof nw3.c
            if (r0 == 0) goto L13
            r0 = r12
            nw3.c r0 = (nw3.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            nw3.c r0 = new nw3.c
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.f219760y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r8 = r0.v
            long r9 = r0.f219758w
            int r11 = r0.u
            kotlin.jvm.functions.Function1 r2 = r0.f219759x
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            yhm.o.b(r12)
        L33:
            r12 = r8
            r8 = r11
            r11 = r2
            goto L51
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            int r8 = r0.v
            long r9 = r0.f219758w
            int r11 = r0.u
            kotlin.jvm.functions.Function1 r2 = r0.f219759x
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            yhm.o.b(r12)
            goto L6a
        L4d:
            yhm.o.b(r12)
            r12 = 0
        L51:
            r2 = r11
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0.f219759x = r2
            r0.u = r8
            r0.f219758w = r9
            r0.v = r12
            r0.A = r4
            java.lang.Object r2 = r11.invoke(r0)
            if (r2 != r1) goto L65
            goto L97
        L65:
            r6 = r11
            r11 = r8
            r8 = r12
            r12 = r2
            r2 = r6
        L6a:
            yhm.m r12 = (yhm.m) r12
            java.lang.Object r12 = r12.f314193a
            boolean r5 = r12 instanceof yhm.n
            if (r5 != 0) goto L76
            yhm.o.b(r12)
            return r12
        L76:
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto L99
            boolean r5 = r12 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L98
            if (r8 >= r11) goto L98
            int r8 = r8 + 1
            r12 = r2
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r0.f219759x = r12
            r0.u = r11
            r0.f219758w = r9
            r0.v = r8
            r0.A = r3
            java.lang.Object r12 = skm.k0.b(r9, r0)
            if (r12 != r1) goto L33
        L97:
            return r1
        L98:
            throw r12
        L99:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.d.d(int, long, nk9.l, gim.c):java.lang.Object");
    }

    public final Object e(h1 h1Var, boolean z, gim.c cVar) {
        Continuation continuation = null;
        if (z) {
            u24.a aVar = this.f219763c;
            aVar.getClass();
            j jVar = new j(aVar, h1Var, continuation, 28);
            p0 p0Var = p0.f264001a;
            return e0.J(f.f127540b, jVar, cVar);
        }
        p pVar = this.d;
        pVar.getClass();
        g gVar = new g(pVar, h1Var, continuation, 8);
        p0 p0Var2 = p0.f264001a;
        return e0.J(f.f127540b, gVar, cVar);
    }
}
