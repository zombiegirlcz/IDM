package o04;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006!"}, d2 = {"Lo04/g;", "", "", "toString", "()Ljava/lang/String;", "Lt14/k;", "a", "Lt14/k;", "g", "()Lt14/k;", "topItem", "", "Lnx4/m0;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "items", "c", "Ljava/lang/String;", "disclaimer", "buttonTitle", "Lo04/c;", "e", "Lo04/c;", "()Lo04/c;", "buttonAction", "Luz3/i;", "f", "Luz3/i;", "()Luz3/i;", "primaryButton", "secondaryButton", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("topItem")
    @NotNull
    private final t14.k topItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> items;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("confirmButtonTitle")
    @NotNull
    private final String buttonTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("confirmButtonAction")
    @lg.a(d.class)
    private final c buttonAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("primaryButton")
    private final uz3.i primaryButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButton")
    private final uz3.i secondaryButton;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getButtonAction() {
        return this.buttonAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final uz3.i getPrimaryButton() {
        return this.primaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.topItem, gVar.topItem) && Intrinsics.f(this.items, gVar.items) && Intrinsics.f(this.disclaimer, gVar.disclaimer) && Intrinsics.f(this.buttonTitle, gVar.buttonTitle) && Intrinsics.f(this.buttonAction, gVar.buttonAction) && Intrinsics.f(this.primaryButton, gVar.primaryButton) && Intrinsics.f(this.secondaryButton, gVar.secondaryButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final uz3.i getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final t14.k getTopItem() {
        return this.topItem;
    }

    public final int hashCode() {
        int iD = p.a.d(this.topItem.hashCode() * 31, 31, this.items);
        String str = this.disclaimer;
        int iC = p.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonTitle);
        c cVar = this.buttonAction;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        uz3.i iVar = this.primaryButton;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        uz3.i iVar2 = this.secondaryButton;
        return iHashCode2 + (iVar2 != null ? iVar2.hashCode() : 0);
    }
}
