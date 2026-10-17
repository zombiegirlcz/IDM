package m8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f203513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f203514c;
    public final Data d;
    public final Data e;
    public final boolean f;

    public m(String faqKey, Data title, Data nodeDetails, Data needMoreHelpState, Data feedback, boolean z) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nodeDetails, "nodeDetails");
        Intrinsics.checkNotNullParameter(needMoreHelpState, "needMoreHelpState");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f203512a = faqKey;
        this.f203513b = title;
        this.f203514c = nodeDetails;
        this.d = needMoreHelpState;
        this.e = feedback;
        this.f = z;
    }

    public static m a(m mVar, Data data, Data data2, Data data3, Data data4, int i) {
        String faqKey = mVar.f203512a;
        if ((i & 2) != 0) {
            data = mVar.f203513b;
        }
        Data title = data;
        if ((i & 4) != 0) {
            data2 = mVar.f203514c;
        }
        Data nodeDetails = data2;
        if ((i & 8) != 0) {
            data3 = mVar.d;
        }
        Data needMoreHelpState = data3;
        if ((i & 16) != 0) {
            data4 = mVar.e;
        }
        Data feedback = data4;
        boolean z = mVar.f;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nodeDetails, "nodeDetails");
        Intrinsics.checkNotNullParameter(needMoreHelpState, "needMoreHelpState");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        return new m(faqKey, title, nodeDetails, needMoreHelpState, feedback, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f203512a, mVar.f203512a) && Intrinsics.f(this.f203513b, mVar.f203513b) && Intrinsics.f(this.f203514c, mVar.f203514c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && this.f == mVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f203514c, kii.e.c(this.f203513b, this.f203512a.hashCode() * 31, 31), 31), 31), 31);
    }
}
