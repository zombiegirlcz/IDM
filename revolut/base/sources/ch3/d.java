package ch3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24119b;

    public d(String campaignId, String stepId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f24118a = campaignId;
        this.f24119b = stepId;
    }

    public final String a() {
        return a0.d.s("checklist_step_details_", this.f24118a, "_", this.f24119b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f24118a, dVar.f24118a) && Intrinsics.f(this.f24119b, dVar.f24119b);
    }

    public final int hashCode() {
        return this.f24119b.hashCode() + (this.f24118a.hashCode() * 31);
    }
}
