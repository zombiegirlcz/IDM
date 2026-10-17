package b8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f13176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f13177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f13178c;
    public final Data d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13179g;

    public m(Data title, Data faq, Data actions, Data faqFeedback, Data nextRequestCallTicket, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(faq, "faq");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(faqFeedback, "faqFeedback");
        Intrinsics.checkNotNullParameter(nextRequestCallTicket, "nextRequestCallTicket");
        this.f13176a = title;
        this.f13177b = faq;
        this.f13178c = actions;
        this.d = faqFeedback;
        this.e = nextRequestCallTicket;
        this.f = z;
        this.f13179g = z3;
    }

    public static m a(m mVar, Data data, Data data2, Data data3, Data data4, Data data5, boolean z, int i) {
        if ((i & 1) != 0) {
            data = mVar.f13176a;
        }
        Data title = data;
        if ((i & 2) != 0) {
            data2 = mVar.f13177b;
        }
        Data faq = data2;
        if ((i & 4) != 0) {
            data3 = mVar.f13178c;
        }
        Data actions = data3;
        if ((i & 8) != 0) {
            data4 = mVar.d;
        }
        Data faqFeedback = data4;
        if ((i & 16) != 0) {
            data5 = mVar.e;
        }
        Data nextRequestCallTicket = data5;
        if ((i & 32) != 0) {
            z = mVar.f;
        }
        boolean z3 = mVar.f13179g;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(faq, "faq");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(faqFeedback, "faqFeedback");
        Intrinsics.checkNotNullParameter(nextRequestCallTicket, "nextRequestCallTicket");
        return new m(title, faq, actions, faqFeedback, nextRequestCallTicket, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f13176a, mVar.f13176a) && Intrinsics.f(this.f13177b, mVar.f13177b) && Intrinsics.f(this.f13178c, mVar.f13178c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && this.f == mVar.f && this.f13179g == mVar.f13179g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13179g) + j6.a.c(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f13178c, kii.e.c(this.f13177b, this.f13176a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
    }
}
