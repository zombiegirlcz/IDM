package rf0;

import e0m.b;
import e0m.d;
import kotlin.jvm.internal.Intrinsics;
import qf0.c;
import qf0.e;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f253673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f253674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f253675c;

    public a(c exceptionsOverseer, e unrecoverableStateGuardian) {
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(unrecoverableStateGuardian, "unrecoverableStateGuardian");
        this.f253673a = exceptionsOverseer;
        this.f253674b = unrecoverableStateGuardian;
        this.f253675c = new b(new r1a.a(this, 12));
    }

    @Override // e0m.d
    public final void init() {
        this.f253675c.init();
    }
}
