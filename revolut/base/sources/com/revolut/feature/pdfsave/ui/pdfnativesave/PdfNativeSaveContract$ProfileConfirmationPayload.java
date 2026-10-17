package com.revolut.feature.pdfsave.ui.pdfnativesave;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload", "Landroid/os/Parcelable;", "Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$Payload;", "<init>", "()V", "Account", "Cards", "Subject", "Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload$Account;", "Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload$Cards;", "Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload$Subject;", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PdfNativeSaveContract$ProfileConfirmationPayload implements Parcelable, PdfNativeSaveContract$Payload {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload$Account;", "Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload;", "", "toString", "()Ljava/lang/String;", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Account extends PdfNativeSaveContract$ProfileConfirmationPayload {

        @NotNull
        public static final Parcelable.Creator<Account> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f80321b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WalletId walletId = (WalletId) parcel.readParcelable(Account.class.getClassLoader());
                return new Account(walletId != null ? walletId.f66106a : null, parcel.readInt() != 0 ? l.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Account[i];
            }
        }

        public Account(String str, l lVar) {
            this.f80320a = str;
            this.f80321b = lVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload.Account
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload$Account r5 = (com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload.Account) r5
                java.lang.String r1 = r5.f80320a
                java.lang.String r3 = r4.f80320a
                if (r3 != 0) goto L18
                if (r1 != 0) goto L16
                r1 = r0
                goto L1f
            L16:
                r1 = r2
                goto L1f
            L18:
                if (r1 != 0) goto L1b
                goto L16
            L1b:
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            L1f:
                if (r1 != 0) goto L22
                return r2
            L22:
                io3.l r1 = r4.f80321b
                io3.l r5 = r5.f80321b
                if (r1 == r5) goto L29
                return r2
            L29:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload.Account.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f80320a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            l lVar = this.f80321b;
            return iHashCode + (lVar != null ? lVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            String str = this.f80320a;
            dest.writeParcelable(str != null ? new WalletId(str) : null, i);
            l lVar = this.f80321b;
            if (lVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(lVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload$Cards;", "Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload;", "<init>", "()V", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cards extends PdfNativeSaveContract$ProfileConfirmationPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cards f80322a = new Cards();

        @NotNull
        public static final Parcelable.Creator<Cards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cards.f80322a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cards[i];
            }
        }

        private Cards() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload$Subject;", "Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$ProfileConfirmationPayload;", "<init>", "()V", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Subject extends PdfNativeSaveContract$ProfileConfirmationPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Subject f80323a = new Subject();

        @NotNull
        public static final Parcelable.Creator<Subject> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Subject.f80323a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subject[i];
            }
        }

        private Subject() {
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

    private PdfNativeSaveContract$ProfileConfirmationPayload() {
    }
}
