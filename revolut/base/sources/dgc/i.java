package dgc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f114632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f114633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f114634c;
    public final a d;
    public final d e;
    public final ArrayList f;

    public i(h header, a faqButton, a feedbackButton, a footerButton, d description, ArrayList sections) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(faqButton, "faqButton");
        Intrinsics.checkNotNullParameter(feedbackButton, "feedbackButton");
        Intrinsics.checkNotNullParameter(footerButton, "footerButton");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f114632a = header;
        this.f114633b = faqButton;
        this.f114634c = feedbackButton;
        this.d = footerButton;
        this.e = description;
        this.f = sections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f114632a.equals(iVar.f114632a) && this.f114633b.equals(iVar.f114633b) && this.f114634c.equals(iVar.f114634c) && this.d.equals(iVar.d) && this.e.equals(iVar.e) && this.f.equals(iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f114634c.hashCode() + ((this.f114633b.hashCode() + (this.f114632a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
