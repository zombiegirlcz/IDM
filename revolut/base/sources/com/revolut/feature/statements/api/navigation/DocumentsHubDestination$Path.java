package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/statements/api/navigation/DocumentsHubDestination$Path", "", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsHubDestination$Path implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<DocumentsHubDestination$Path> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentsHubInitialConfiguration f88252c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String str = DocumentsHubType.CREATOR.createFromParcel(parcel).f88260a;
            DocumentsHubProduct documentsHubProductCreateFromParcel = parcel.readInt() == 0 ? null : DocumentsHubProduct.CREATOR.createFromParcel(parcel);
            return new DocumentsHubDestination$Path(str, documentsHubProductCreateFromParcel != null ? documentsHubProductCreateFromParcel.f88259a : null, (DocumentsHubInitialConfiguration) parcel.readParcelable(DocumentsHubDestination$Path.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentsHubDestination$Path[i];
        }
    }

    public DocumentsHubDestination$Path(String type, String str, DocumentsHubInitialConfiguration initialConfiguration) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(initialConfiguration, "initialConfiguration");
        this.f88250a = type;
        this.f88251b = str;
        this.f88252c = initialConfiguration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentsHubInitialConfiguration getF88252c() {
        return this.f88252c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF88251b() {
        return this.f88251b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF88250a() {
        return this.f88250a;
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
            boolean r1 = r6 instanceof com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Path
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Path r6 = (com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Path) r6
            java.lang.String r1 = r6.f88250a
            com.revolut.feature.statements.api.navigation.DocumentsHubType$a r3 = com.revolut.feature.statements.api.navigation.DocumentsHubType.INSTANCE
            java.lang.String r3 = r5.f88250a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            if (r1 != 0) goto L19
            return r2
        L19:
            java.lang.String r1 = r6.f88251b
            java.lang.String r3 = r5.f88251b
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
            com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration r1 = r5.f88252c
            com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration r6 = r6.f88252c
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 != 0) goto L3c
            return r2
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Path.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
        int iHashCode2 = this.f88250a.hashCode() * 31;
        String str = this.f88251b;
        if (str == null) {
            iHashCode = 0;
        } else {
            DocumentsHubProduct.Companion companion2 = DocumentsHubProduct.INSTANCE;
            iHashCode = str.hashCode();
        }
        return this.f88252c.hashCode() + ((iHashCode2 + iHashCode) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88250a);
        String str = this.f88251b;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            DocumentsHubProduct.Companion companion2 = DocumentsHubProduct.INSTANCE;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(str);
        }
        dest.writeParcelable(this.f88252c, i);
    }
}
