package bld;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeedbackBundle f16533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f16534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f16535c;
    public final f1 d;

    public f(FeedbackBundle feedbackBundle, TextLocalisedClause message, TextLocalisedClause action, f1 position) {
        Intrinsics.checkNotNullParameter("tell_us_more", "toastId");
        Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f16533a = feedbackBundle;
        this.f16534b = message;
        this.f16535c = action;
        this.d = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f16533a.equals(fVar.f16533a) && this.f16534b.equals(fVar.f16534b) && this.f16535c.equals(fVar.f16535c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a((this.f16533a.hashCode() - 419940552) * 31, 31, this.f16534b), 31, this.f16535c);
    }
}
