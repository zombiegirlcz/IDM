package com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/screens/about_note_glossary/AboutNoteGlossaryScreenContract$Category", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/structured_note/details/impl/ui/screens/about_note_glossary/AboutNoteGlossaryScreenContract$Category;", "ISSUE", "COUPON", "CALL", "CAPITAL_PROTECTION", "FINAL_PAYOUT", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AboutNoteGlossaryScreenContract$Category implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AboutNoteGlossaryScreenContract$Category[] $VALUES;
    public static final AboutNoteGlossaryScreenContract$Category CALL;
    public static final AboutNoteGlossaryScreenContract$Category CAPITAL_PROTECTION;
    public static final AboutNoteGlossaryScreenContract$Category COUPON;

    @NotNull
    public static final Parcelable.Creator<AboutNoteGlossaryScreenContract$Category> CREATOR;
    public static final AboutNoteGlossaryScreenContract$Category FINAL_PAYOUT;
    public static final AboutNoteGlossaryScreenContract$Category ISSUE;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return AboutNoteGlossaryScreenContract$Category.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AboutNoteGlossaryScreenContract$Category[i];
        }
    }

    static {
        AboutNoteGlossaryScreenContract$Category aboutNoteGlossaryScreenContract$Category = new AboutNoteGlossaryScreenContract$Category("ISSUE", 0);
        ISSUE = aboutNoteGlossaryScreenContract$Category;
        AboutNoteGlossaryScreenContract$Category aboutNoteGlossaryScreenContract$Category2 = new AboutNoteGlossaryScreenContract$Category("COUPON", 1);
        COUPON = aboutNoteGlossaryScreenContract$Category2;
        AboutNoteGlossaryScreenContract$Category aboutNoteGlossaryScreenContract$Category3 = new AboutNoteGlossaryScreenContract$Category("CALL", 2);
        CALL = aboutNoteGlossaryScreenContract$Category3;
        AboutNoteGlossaryScreenContract$Category aboutNoteGlossaryScreenContract$Category4 = new AboutNoteGlossaryScreenContract$Category("CAPITAL_PROTECTION", 3);
        CAPITAL_PROTECTION = aboutNoteGlossaryScreenContract$Category4;
        AboutNoteGlossaryScreenContract$Category aboutNoteGlossaryScreenContract$Category5 = new AboutNoteGlossaryScreenContract$Category("FINAL_PAYOUT", 4);
        FINAL_PAYOUT = aboutNoteGlossaryScreenContract$Category5;
        AboutNoteGlossaryScreenContract$Category[] aboutNoteGlossaryScreenContract$CategoryArr = {aboutNoteGlossaryScreenContract$Category, aboutNoteGlossaryScreenContract$Category2, aboutNoteGlossaryScreenContract$Category3, aboutNoteGlossaryScreenContract$Category4, aboutNoteGlossaryScreenContract$Category5};
        $VALUES = aboutNoteGlossaryScreenContract$CategoryArr;
        $ENTRIES = s.n(aboutNoteGlossaryScreenContract$CategoryArr);
        CREATOR = new a();
    }

    public static AboutNoteGlossaryScreenContract$Category valueOf(String str) {
        return (AboutNoteGlossaryScreenContract$Category) Enum.valueOf(AboutNoteGlossaryScreenContract$Category.class, str);
    }

    public static AboutNoteGlossaryScreenContract$Category[] values() {
        return (AboutNoteGlossaryScreenContract$Category[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
