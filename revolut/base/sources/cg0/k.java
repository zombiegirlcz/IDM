package cg0;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\""}, d2 = {"Lcg0/k;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "key", "b", "getTitle", "title", "c", "content", "d", "f", "placement", "", "Ljava/lang/Integer;", "getWeight", "()Ljava/lang/Integer;", "weight", "", "Lcg0/c;", "Ljava/util/List;", "()Ljava/util/List;", "actions", "g", "h", "specialisationQueue", "Lcg0/d;", "chatEntrySuggestions", "i", "contentStyle", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    private final String content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("placement")
    private final String placement;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("weight")
    private final Integer weight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("actions")
    private final List<c> actions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("specialisationQueue")
    private final String specialisationQueue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("chatEntrySuggestions")
    private final List<d> chatEntrySuggestions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("contentStyle")
    private final String contentStyle;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getChatEntrySuggestions() {
        return this.chatEntrySuggestions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getContentStyle() {
        return this.contentStyle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.key, kVar.key) && Intrinsics.f(this.title, kVar.title) && Intrinsics.f(this.content, kVar.content) && Intrinsics.f(this.placement, kVar.placement) && Intrinsics.f(this.weight, kVar.weight) && Intrinsics.f(this.actions, kVar.actions) && Intrinsics.f(this.specialisationQueue, kVar.specialisationQueue) && Intrinsics.f(this.chatEntrySuggestions, kVar.chatEntrySuggestions) && Intrinsics.f(this.contentStyle, kVar.contentStyle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlacement() {
        return this.placement;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSpecialisationQueue() {
        return this.specialisationQueue;
    }

    public final int hashCode() {
        int iC = p.a.c(this.key.hashCode() * 31, 31, this.title);
        String str = this.content;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placement;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.weight;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<c> list = this.actions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.specialisationQueue;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<d> list2 = this.chatEntrySuggestions;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.contentStyle;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }
}
