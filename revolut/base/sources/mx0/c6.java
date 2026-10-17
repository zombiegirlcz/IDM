package mx0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c6 implements koi.j, qv0.p {

    @NotNull
    public static final y5 Companion = new y5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f209630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f209632c;

    public c6(Object obj2, boolean z) {
        this.f209630a = z;
        this.f209631b = true;
        this.f209632c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public Object getE() {
        return this.f209632c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public abstract String getF51822a();

    public boolean e() {
        return this.f209631b;
    }

    public boolean f() {
        return this.f209630a;
    }

    public /* synthetic */ c6() {
        this(null, false);
    }
}
