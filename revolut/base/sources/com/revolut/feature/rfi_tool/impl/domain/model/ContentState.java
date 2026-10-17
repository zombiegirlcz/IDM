package com.revolut.feature.rfi_tool.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/domain/model/ContentState;", "Landroid/os/Parcelable;", "", "CREATED", "UNKNOWN", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContentState implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentState[] $VALUES;
    public static final ContentState CREATED;

    @NotNull
    public static final Parcelable.Creator<ContentState> CREATOR;
    public static final ContentState UNKNOWN;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ContentState.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContentState[i];
        }
    }

    static {
        ContentState contentState = new ContentState("CREATED", 0);
        CREATED = contentState;
        ContentState contentState2 = new ContentState("UNKNOWN", 1);
        UNKNOWN = contentState2;
        ContentState[] contentStateArr = {contentState, contentState2};
        $VALUES = contentStateArr;
        $ENTRIES = s.n(contentStateArr);
        CREATOR = new a();
    }

    public static ContentState valueOf(String str) {
        return (ContentState) Enum.valueOf(ContentState.class, str);
    }

    public static ContentState[] values() {
        return (ContentState[]) $VALUES.clone();
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
