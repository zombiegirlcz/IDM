package com.revolut.cards.shared.ui.screen.transition;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.ui_kit.carousel_with_sheet.R$id;
import com.revolut.ui_kit.carousel_with_sheet.transition.CarouselTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/cards/shared/ui/screen/transition/CardsCarouselTransition;", "Lcom/revolut/ui_kit/carousel_with_sheet/transition/CarouselTransition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsCarouselTransition extends CarouselTransition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardsCarouselTransition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50958a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsCarouselTransition(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsCarouselTransition[i];
        }
    }

    public CardsCarouselTransition() {
        this((Object) null);
    }

    @Override // com.revolut.kompot.navigable.TransitionAnimation.ViewDelegated
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final int getF50958a() {
        return this.f50958a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CardsCarouselTransition) && this.f50958a == ((CardsCarouselTransition) obj2).f50958a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50958a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50958a);
    }

    public CardsCarouselTransition(int i) {
        this.f50958a = i;
    }

    public /* synthetic */ CardsCarouselTransition(Object obj2) {
        this(R$id.cardsCarousel_rootControllerView);
    }
}
