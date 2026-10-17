package ajm;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class z implements i {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Member f5624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f5625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f5626c;
    public final List d;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f5624a = r1
            r0.f5625b = r2
            r0.f5626c = r3
            if (r3 == 0) goto L29
            kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            java.util.ArrayList r1 = r1.f186433a
            int r2 = r1.size()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.util.List r1 = zhm.v.k(r1)
            if (r1 != 0) goto L2d
        L29:
            java.util.List r1 = kotlin.collections.d.v0(r4)
        L2d:
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ajm.z.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    public void a(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (ksj.b.j(this) == args.length) {
            return;
        }
        StringBuilder sb6 = new StringBuilder("Callable expects ");
        sb6.append(ksj.b.j(this));
        sb6.append(" arguments, but ");
        throw new IllegalArgumentException(j6.a.v(sb6, " were provided.", args.length));
    }

    @Override // ajm.i
    public final Member b() {
        return this.f5624a;
    }

    @Override // ajm.i
    public final /* bridge */ boolean c() {
        return false;
    }

    @Override // ajm.i
    public final List d() {
        return this.d;
    }

    public final void e(Object obj2) {
        if (obj2 == null || !this.f5624a.getDeclaringClass().isInstance(obj2)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // ajm.i
    public final Type getReturnType() {
        return this.f5625b;
    }
}
