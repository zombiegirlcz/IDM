package com.revolut.feature.pix.impl.flow.copy_paste;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pix/impl/flow/copy_paste/PixCopyPasteContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CodeInput", "OpenQrScanner", "Lcom/revolut/feature/pix/impl/flow/copy_paste/PixCopyPasteContract$Step$CodeInput;", "Lcom/revolut/feature/pix/impl/flow/copy_paste/PixCopyPasteContract$Step$OpenQrScanner;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixCopyPasteContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/copy_paste/PixCopyPasteContract$Step$CodeInput;", "Lcom/revolut/feature/pix/impl/flow/copy_paste/PixCopyPasteContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CodeInput implements PixCopyPasteContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CodeInput f80632a = new CodeInput();

        @NotNull
        public static final Parcelable.Creator<CodeInput> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CodeInput.f80632a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CodeInput[i];
            }
        }

        private CodeInput() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/copy_paste/PixCopyPasteContract$Step$OpenQrScanner;", "Lcom/revolut/feature/pix/impl/flow/copy_paste/PixCopyPasteContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenQrScanner implements PixCopyPasteContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenQrScanner f80633a = new OpenQrScanner();

        @NotNull
        public static final Parcelable.Creator<OpenQrScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenQrScanner.f80633a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenQrScanner[i];
            }
        }

        private OpenQrScanner() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
