package cg0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\f\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u001d\u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b\u0011\u0010$¨\u0006&"}, d2 = {"Lcg0/l0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "g", "key", "c", "j", "title", "", "Lcg0/i0;", "d", "Ljava/util/List;", "()Ljava/util/List;", "actions", "i", "subtitle", "f", "content", "Lcg0/k0;", "Lcg0/k0;", "()Lcg0/k0;", "contentLink", "h", "image", "Lcg0/m0;", "Lcg0/m0;", "()Lcg0/m0;", "subContents", "Lcg0/i0;", "()Lcg0/i0;", "help", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("actions")
    @NotNull
    private final List<i0> actions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("content")
    private final String content;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("contentLink")
    private final k0 contentLink;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("image")
    private final String image;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("subContents")
    private final m0 subContents;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("help")
    private final i0 help;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k0 getContentLink() {
        return this.contentLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i0 getHelp() {
        return this.help;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.id, l0Var.id) && Intrinsics.f(this.key, l0Var.key) && Intrinsics.f(this.title, l0Var.title) && Intrinsics.f(this.actions, l0Var.actions) && Intrinsics.f(this.subtitle, l0Var.subtitle) && Intrinsics.f(this.content, l0Var.content) && Intrinsics.f(this.contentLink, l0Var.contentLink) && Intrinsics.f(this.image, l0Var.image) && Intrinsics.f(this.subContents, l0Var.subContents) && Intrinsics.f(this.help, l0Var.help);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final m0 getSubContents() {
        return this.subContents;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.key), 31, this.title), 31, this.actions);
        String str = this.subtitle;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        k0 k0Var = this.contentLink;
        int iHashCode3 = (iHashCode2 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        m0 m0Var = this.subContents;
        int iHashCode5 = (iHashCode4 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        i0 i0Var = this.help;
        return iHashCode5 + (i0Var != null ? i0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
