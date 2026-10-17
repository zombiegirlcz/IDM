package com.revolut.feature.statements.impl.ui.documents_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/statements/impl/ui/documents_hub/DocumentsHubScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsHubScreenContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentsHubInitialConfiguration f88358c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<DocumentsHubScreenContract$InputData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static DocumentsHubScreenContract$InputData a(String str, String str2, DocumentsHubInitialConfiguration initialConfiguration) {
            Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubType$-type$0");
            Intrinsics.checkNotNullParameter(initialConfiguration, "initialConfiguration");
            DocumentsHubType.INSTANCE.getClass();
            if (Intrinsics.f(str, "root")) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            return new DocumentsHubScreenContract$InputData(str, str2, initialConfiguration);
        }

        public static DocumentsHubScreenContract$InputData b() {
            DocumentsHubType.INSTANCE.getClass();
            return new DocumentsHubScreenContract$InputData("root", null, DocumentsHubInitialConfiguration.Default.f88256a);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String str = ((DocumentsHubType) parcel.readParcelable(DocumentsHubScreenContract$InputData.class.getClassLoader())).f88260a;
            DocumentsHubProduct documentsHubProduct = (DocumentsHubProduct) parcel.readParcelable(DocumentsHubScreenContract$InputData.class.getClassLoader());
            return new DocumentsHubScreenContract$InputData(str, documentsHubProduct != null ? documentsHubProduct.f88259a : null, (DocumentsHubInitialConfiguration) parcel.readParcelable(DocumentsHubScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentsHubScreenContract$InputData[i];
        }
    }

    public DocumentsHubScreenContract$InputData(String str, String str2, DocumentsHubInitialConfiguration documentsHubInitialConfiguration) {
        this.f88356a = str;
        this.f88357b = str2;
        this.f88358c = documentsHubInitialConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData r6 = (com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData) r6
            java.lang.String r1 = r6.f88356a
            com.revolut.feature.statements.api.navigation.DocumentsHubType$a r3 = com.revolut.feature.statements.api.navigation.DocumentsHubType.INSTANCE
            java.lang.String r3 = r5.f88356a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            if (r1 != 0) goto L19
            return r2
        L19:
            java.lang.String r1 = r6.f88357b
            java.lang.String r3 = r5.f88357b
            if (r3 != 0) goto L25
            if (r1 != 0) goto L23
            r1 = r0
            goto L2e
        L23:
            r1 = r2
            goto L2e
        L25:
            if (r1 != 0) goto L28
            goto L23
        L28:
            com.revolut.feature.statements.api.navigation.DocumentsHubProduct$a r4 = com.revolut.feature.statements.api.navigation.DocumentsHubProduct.INSTANCE
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L2e:
            if (r1 != 0) goto L31
            return r2
        L31:
            com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration r1 = r5.f88358c
            com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration r6 = r6.f88358c
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 != 0) goto L3c
            return r2
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
        int iHashCode2 = this.f88356a.hashCode() * 31;
        String str = this.f88357b;
        if (str == null) {
            iHashCode = 0;
        } else {
            DocumentsHubProduct.Companion companion2 = DocumentsHubProduct.INSTANCE;
            iHashCode = str.hashCode();
        }
        return this.f88358c.hashCode() + ((iHashCode2 + iHashCode) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(new DocumentsHubType(this.f88356a), i);
        String str = this.f88357b;
        dest.writeParcelable(str != null ? new DocumentsHubProduct(str) : null, i);
        dest.writeParcelable(this.f88358c, i);
    }
}
