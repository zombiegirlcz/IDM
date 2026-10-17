package z14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R$\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lz14/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "f", "subtitle", "", "Lnx4/m0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "items", "d", "bottomItems", "Lz14/a$a;", "e", "Lz14/a$a;", "()Lz14/a$a;", "primaryButton", "secondaryButton", "disclaimer", "", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isValidItemsSelection", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bottomItems")
    private final List<m0> bottomItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("primaryButton")
    @NotNull
    private final C1771a primaryButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("secondaryButton")
    private final C1771a secondaryButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("isValidItemsSelection")
    private final Boolean isValidItemsSelection;

    /* JADX INFO: renamed from: z14.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lz14/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "title", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1771a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1771a) && Intrinsics.f(this.title, ((C1771a) obj2).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBottomItems() {
        return this.bottomItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C1771a getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C1771a getSecondaryButton() {
        return this.secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.items, aVar.items) && Intrinsics.f(this.bottomItems, aVar.bottomItems) && Intrinsics.f(this.primaryButton, aVar.primaryButton) && Intrinsics.f(this.secondaryButton, aVar.secondaryButton) && Intrinsics.f(this.disclaimer, aVar.disclaimer) && Intrinsics.f(this.isValidItemsSelection, aVar.isValidItemsSelection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsValidItemsSelection() {
        return this.isValidItemsSelection;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.items);
        List<m0> list = this.bottomItems;
        int iHashCode = (this.primaryButton.hashCode() + ((iD + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        C1771a c1771a = this.secondaryButton;
        int iHashCode2 = (iHashCode + (c1771a == null ? 0 : c1771a.hashCode())) * 31;
        String str = this.disclaimer;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isValidItemsSelection;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
