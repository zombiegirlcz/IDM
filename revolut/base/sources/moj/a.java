package moj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements q7l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7l.a f207661b;

    public a(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.f207660a = eventId;
        this.f207661b = q7l.a.NORMAL;
    }

    @Override // q7l.b
    public final q7l.a a() {
        return this.f207661b;
    }

    @Override // q7l.b
    public final String b() {
        return this.f207660a;
    }
}
