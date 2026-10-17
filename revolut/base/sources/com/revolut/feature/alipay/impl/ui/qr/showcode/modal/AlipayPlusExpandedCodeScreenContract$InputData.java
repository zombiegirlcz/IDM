package com.revolut.feature.alipay.impl.ui.qr.showcode.modal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/alipay/impl/ui/qr/showcode/modal/AlipayPlusExpandedCodeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "CodeType", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AlipayPlusExpandedCodeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AlipayPlusExpandedCodeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodeType f61083a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/showcode/modal/AlipayPlusExpandedCodeScreenContract$InputData$CodeType;", "Landroid/os/Parcelable;", "", "BARCODE", "QR_CODE", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CodeType implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CodeType[] $VALUES;
        public static final CodeType BARCODE;

        @NotNull
        public static final Parcelable.Creator<CodeType> CREATOR;
        public static final CodeType QR_CODE;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return CodeType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CodeType[i];
            }
        }

        static {
            CodeType codeType = new CodeType("BARCODE", 0);
            BARCODE = codeType;
            CodeType codeType2 = new CodeType("QR_CODE", 1);
            QR_CODE = codeType2;
            CodeType[] codeTypeArr = {codeType, codeType2};
            $VALUES = codeTypeArr;
            $ENTRIES = s.n(codeTypeArr);
            CREATOR = new a();
        }

        public static CodeType valueOf(String str) {
            return (CodeType) Enum.valueOf(CodeType.class, str);
        }

        public static CodeType[] values() {
            return (CodeType[]) $VALUES.clone();
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlipayPlusExpandedCodeScreenContract$InputData(CodeType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AlipayPlusExpandedCodeScreenContract$InputData[i];
        }
    }

    public AlipayPlusExpandedCodeScreenContract$InputData(CodeType codeType) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        this.f61083a = codeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AlipayPlusExpandedCodeScreenContract$InputData) && this.f61083a == ((AlipayPlusExpandedCodeScreenContract$InputData) obj2).f61083a;
    }

    public final int hashCode() {
        return this.f61083a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f61083a.writeToParcel(dest, i);
    }
}
