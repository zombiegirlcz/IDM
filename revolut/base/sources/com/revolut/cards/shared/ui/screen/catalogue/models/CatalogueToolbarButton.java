package com.revolut.cards.shared.ui.screen.catalogue.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/cards/shared/ui/screen/catalogue/models/CatalogueToolbarButton;", "Landroid/os/Parcelable;", "GoVirtual", "GoPhysical", "Lcom/revolut/cards/shared/ui/screen/catalogue/models/CatalogueToolbarButton$GoPhysical;", "Lcom/revolut/cards/shared/ui/screen/catalogue/models/CatalogueToolbarButton$GoVirtual;", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CatalogueToolbarButton extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/cards/shared/ui/screen/catalogue/models/CatalogueToolbarButton$GoPhysical;", "Lcom/revolut/cards/shared/ui/screen/catalogue/models/CatalogueToolbarButton;", "", "toString", "()Ljava/lang/String;", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GoPhysical implements CatalogueToolbarButton {

        @NotNull
        public static final Parcelable.Creator<GoPhysical> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f50956a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GoPhysical((Clause) parcel.readParcelable(GoPhysical.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GoPhysical[i];
            }
        }

        public GoPhysical(Clause text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f50956a = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GoPhysical) && Intrinsics.f(this.f50956a, ((GoPhysical) obj2).f50956a);
        }

        @Override // com.revolut.cards.shared.ui.screen.catalogue.models.CatalogueToolbarButton
        /* JADX INFO: renamed from: getText, reason: from getter */
        public final Clause getF50957a() {
            return this.f50956a;
        }

        public final int hashCode() {
            return this.f50956a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50956a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/cards/shared/ui/screen/catalogue/models/CatalogueToolbarButton$GoVirtual;", "Lcom/revolut/cards/shared/ui/screen/catalogue/models/CatalogueToolbarButton;", "", "toString", "()Ljava/lang/String;", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GoVirtual implements CatalogueToolbarButton {

        @NotNull
        public static final Parcelable.Creator<GoVirtual> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f50957a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GoVirtual((Clause) parcel.readParcelable(GoVirtual.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GoVirtual[i];
            }
        }

        public GoVirtual(Clause text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f50957a = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GoVirtual) && Intrinsics.f(this.f50957a, ((GoVirtual) obj2).f50957a);
        }

        @Override // com.revolut.cards.shared.ui.screen.catalogue.models.CatalogueToolbarButton
        /* JADX INFO: renamed from: getText, reason: from getter */
        public final Clause getF50957a() {
            return this.f50957a;
        }

        public final int hashCode() {
            return this.f50957a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50957a, i);
        }
    }

    /* JADX INFO: renamed from: getText */
    Clause getF50957a();
}
