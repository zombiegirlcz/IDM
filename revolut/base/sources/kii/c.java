package kii;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import tji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f184242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f184243c;
    public final Clause d;
    public final Clause e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f184244g;

    public c(String dialogId, TextLocalisedClause textLocalisedClause, TextLocalisedClause message, TextLocalisedClause positiveButton, TextLocalisedClause textLocalisedClause2, Serializable serializable, boolean z, int i) {
        dialogId = (i & 1) != 0 ? "" : dialogId;
        textLocalisedClause = (i & 2) != 0 ? null : textLocalisedClause;
        positiveButton = (i & 8) != 0 ? new TextLocalisedClause(R$string.common_action_ok, null, null, 14) : positiveButton;
        textLocalisedClause2 = (i & 32) != 0 ? null : textLocalisedClause2;
        serializable = (i & 64) != 0 ? null : serializable;
        z = (i & 128) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
        this.f184241a = dialogId;
        this.f184242b = textLocalisedClause;
        this.f184243c = message;
        this.d = positiveButton;
        this.e = textLocalisedClause2;
        this.f = serializable;
        this.f184244g = z;
    }

    public final String a() {
        return this.f184241a;
    }

    public final Clause b() {
        return this.f184243c;
    }

    public final Clause c() {
        return this.e;
    }

    public final Object d() {
        return this.f;
    }

    public final Clause e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f184241a, cVar.f184241a) && Intrinsics.f(this.f184242b, cVar.f184242b) && Intrinsics.f(this.f184243c, cVar.f184243c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f184244g == cVar.f184244g;
    }

    public final Clause f() {
        return this.f184242b;
    }

    public final boolean g() {
        return this.f184244g;
    }

    public final int hashCode() {
        int iHashCode = this.f184241a.hashCode() * 31;
        Clause clause = this.f184242b;
        int iA = p.a.a(t61.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f184243c), 961, this.d);
        Clause clause2 = this.e;
        int iHashCode2 = (iA + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Object obj2 = this.f;
        return j6.a.c((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 961, this.f184244g);
    }
}
