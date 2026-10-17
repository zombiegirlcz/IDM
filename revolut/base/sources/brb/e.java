package brb;

import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f17981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlm.c f17982b;

    public e(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f17981a = storage;
        this.f17982b = hlm.d.a();
    }

    public static final Set a(e eVar, ue0.c cVar) {
        Type type = l21.d.f191611b;
        Intrinsics.checkNotNullExpressionValue(type, "<get-SET_OF_STRINGS_TYPE>(...)");
        return (Set) cVar.T2("KEY_UNSYNCED_COMPLETED_TIPS", type);
    }

    public static final void b(e eVar, ue0.c cVar, Set set) {
        if (set.isEmpty()) {
            cVar.I0("KEY_UNSYNCED_COMPLETED_TIPS");
        } else {
            cVar.G(set, "KEY_UNSYNCED_COMPLETED_TIPS", kii.e.o(String.class, KTypeProjection.INSTANCE, Set.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof brb.b
            if (r0 == 0) goto L13
            r0 = r9
            brb.b r0 = (brb.b) r0
            int r1 = r0.f17976y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17976y = r1
            goto L18
        L13:
            brb.b r0 = new brb.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f17974w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17976y
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6b
        L2e:
            r9 = move-exception
            goto L75
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            int r2 = r0.v
            hlm.a r5 = r0.u
            yhm.o.b(r9)
            r9 = r5
            goto L54
        L41:
            yhm.o.b(r9)
            hlm.c r9 = r8.f17982b
            r0.u = r9
            r0.v = r6
            r0.f17976y = r5
            java.lang.Object r2 = r9.lock(r3, r0)
            if (r2 != r1) goto L53
            goto L69
        L53:
            r2 = r6
        L54:
            brb.c r5 = new brb.c     // Catch: java.lang.Throwable -> L71
            r5.<init>(r8, r3, r3, r6)     // Catch: java.lang.Throwable -> L71
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L71
            elm.f r6 = elm.f.f127540b     // Catch: java.lang.Throwable -> L71
            r0.u = r9     // Catch: java.lang.Throwable -> L71
            r0.v = r2     // Catch: java.lang.Throwable -> L71
            r0.f17976y = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = skm.e0.J(r6, r5, r0)     // Catch: java.lang.Throwable -> L71
            if (r0 != r1) goto L6a
        L69:
            return r1
        L6a:
            r0 = r9
        L6b:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2e
            r0.unlock(r3)
            return r9
        L71:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L75:
            r0.unlock(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: brb.e.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof brb.d
            if (r0 == 0) goto L13
            r0 = r10
            brb.d r0 = (brb.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            brb.d r0 = new brb.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f17979x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r9 = r0.v
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2d
            goto L72
        L2d:
            r10 = move-exception
            goto L7c
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            int r9 = r0.f17978w
            hlm.a r2 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r10)
            r10 = r2
            r2 = r9
            r9 = r6
            goto L59
        L44:
            yhm.o.b(r10)
            r0.u = r9
            hlm.c r10 = r8.f17982b
            r0.v = r10
            r2 = 0
            r0.f17978w = r2
            r0.z = r4
            java.lang.Object r6 = r10.lock(r5, r0)
            if (r6 != r1) goto L59
            goto L70
        L59:
            brb.c r6 = new brb.c     // Catch: java.lang.Throwable -> L78
            r6.<init>(r8, r9, r5, r4)     // Catch: java.lang.Throwable -> L78
            skm.p0 r9 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L78
            elm.f r9 = elm.f.f127540b     // Catch: java.lang.Throwable -> L78
            r0.u = r5     // Catch: java.lang.Throwable -> L78
            r0.v = r10     // Catch: java.lang.Throwable -> L78
            r0.f17978w = r2     // Catch: java.lang.Throwable -> L78
            r0.z = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = skm.e0.J(r9, r6, r0)     // Catch: java.lang.Throwable -> L78
            if (r9 != r1) goto L71
        L70:
            return r1
        L71:
            r9 = r10
        L72:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r9.unlock(r5)
            return r10
        L78:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7c:
            r9.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: brb.e.d(java.lang.String, gim.c):java.lang.Object");
    }
}
