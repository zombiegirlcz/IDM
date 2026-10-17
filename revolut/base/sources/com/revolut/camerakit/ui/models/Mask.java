package com.revolut.camerakit.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rz.m;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask;", "Landroid/os/Parcelable;", "Face", "FaceZebra", "Document", "DocumentZebra", "ActiveLiveness", "QrCode", "Barcode", "Empty", "rz/m", "Lcom/revolut/camerakit/ui/models/Mask$ActiveLiveness;", "Lcom/revolut/camerakit/ui/models/Mask$Barcode;", "Lcom/revolut/camerakit/ui/models/Mask$Document;", "Lcom/revolut/camerakit/ui/models/Mask$DocumentZebra;", "Lcom/revolut/camerakit/ui/models/Mask$Empty;", "Lcom/revolut/camerakit/ui/models/Mask$Face;", "Lcom/revolut/camerakit/ui/models/Mask$FaceZebra;", "Lcom/revolut/camerakit/ui/models/Mask$QrCode;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Mask extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$ActiveLiveness;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveLiveness implements Mask {

        @NotNull
        public static final Parcelable.Creator<ActiveLiveness> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f50827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50829c;
        public final int d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActiveLiveness(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveLiveness[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ActiveLiveness() {
            int i = 0;
            this(i, i, i, 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4, reason: from getter */
        public final int getF50848b() {
            return this.f50828b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7, reason: from getter */
        public final int getF50849c() {
            return this.f50829c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActiveLiveness)) {
                return false;
            }
            ActiveLiveness activeLiveness = (ActiveLiveness) obj2;
            return this.f50827a == activeLiveness.f50827a && this.f50828b == activeLiveness.f50828b && this.f50829c == activeLiveness.f50829c && this.d == activeLiveness.d && this.e == activeLiveness.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f50829c, j6.a.b(this.f50828b, this.f50827a.hashCode() * 31, 31), 31), 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50827a;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50827a.name());
            dest.writeInt(this.f50828b);
            dest.writeInt(this.f50829c);
            dest.writeInt(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }

        public ActiveLiveness(m scaleType, int i, int i2, int i3, boolean z) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            this.f50827a = scaleType;
            this.f50828b = i;
            this.f50829c = i2;
            this.d = i3;
            this.e = z;
        }

        public /* synthetic */ ActiveLiveness(int i, int i2, int i3, int i5) {
            this(m.CENTER, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, true);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$Barcode;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Barcode implements Mask {

        @NotNull
        public static final Parcelable.Creator<Barcode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f50830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50832c;
        public final int d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Barcode(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Barcode[i];
            }
        }

        public Barcode() {
            this((m) null, 0, 0, 0, 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4, reason: from getter */
        public final int getF50848b() {
            return this.f50831b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7, reason: from getter */
        public final int getF50849c() {
            return this.f50832c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Barcode)) {
                return false;
            }
            Barcode barcode = (Barcode) obj2;
            return this.f50830a == barcode.f50830a && this.f50831b == barcode.f50831b && this.f50832c == barcode.f50832c && this.d == barcode.d && this.e == barcode.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f50832c, j6.a.b(this.f50831b, this.f50830a.hashCode() * 31, 31), 31), 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50830a;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50830a.name());
            dest.writeInt(this.f50831b);
            dest.writeInt(this.f50832c);
            dest.writeInt(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }

        public Barcode(m scaleType, int i, int i2, int i3, boolean z) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            this.f50830a = scaleType;
            this.f50831b = i;
            this.f50832c = i2;
            this.d = i3;
            this.e = z;
        }

        public /* synthetic */ Barcode(m mVar, int i, int i2, int i3, int i5) {
            this((i5 & 1) != 0 ? m.CENTER : mVar, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, true);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$Document;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document implements Mask {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f50833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50835c;
        public final int d;
        public final DocumentMaskModel e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), DocumentMaskModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(m scaleType, int i, int i2, int i3, DocumentMaskModel documentMaskModel, boolean z) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            Intrinsics.checkNotNullParameter(documentMaskModel, "documentMaskModel");
            this.f50833a = scaleType;
            this.f50834b = i;
            this.f50835c = i2;
            this.d = i3;
            this.e = documentMaskModel;
            this.f = z;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4, reason: from getter */
        public final int getF50848b() {
            return this.f50834b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7, reason: from getter */
        public final int getF50849c() {
            return this.f50835c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Document)) {
                return false;
            }
            Document document = (Document) obj2;
            return this.f50833a == document.f50833a && this.f50834b == document.f50834b && this.f50835c == document.f50835c && this.d == document.d && Intrinsics.f(this.e, document.e) && this.f == document.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + ((this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f50835c, j6.a.b(this.f50834b, this.f50833a.hashCode() * 31, 31), 31), 31)) * 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50833a;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50833a.name());
            dest.writeInt(this.f50834b);
            dest.writeInt(this.f50835c);
            dest.writeInt(this.d);
            this.e.writeToParcel(dest, i);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$DocumentZebra;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentZebra implements Mask {

        @NotNull
        public static final Parcelable.Creator<DocumentZebra> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f50836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50838c;
        public final int d;
        public final DocumentMaskModel e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentZebra(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), DocumentMaskModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentZebra[i];
            }
        }

        public DocumentZebra(m scaleType, int i, int i2, int i3, DocumentMaskModel documentMaskModel, boolean z) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            Intrinsics.checkNotNullParameter(documentMaskModel, "documentMaskModel");
            this.f50836a = scaleType;
            this.f50837b = i;
            this.f50838c = i2;
            this.d = i3;
            this.e = documentMaskModel;
            this.f = z;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4, reason: from getter */
        public final int getF50848b() {
            return this.f50837b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7, reason: from getter */
        public final int getF50849c() {
            return this.f50838c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentZebra)) {
                return false;
            }
            DocumentZebra documentZebra = (DocumentZebra) obj2;
            return this.f50836a == documentZebra.f50836a && this.f50837b == documentZebra.f50837b && this.f50838c == documentZebra.f50838c && this.d == documentZebra.d && Intrinsics.f(this.e, documentZebra.e) && this.f == documentZebra.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + ((this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f50838c, j6.a.b(this.f50837b, this.f50836a.hashCode() * 31, 31), 31), 31)) * 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50836a;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50836a.name());
            dest.writeInt(this.f50837b);
            dest.writeInt(this.f50838c);
            dest.writeInt(this.d);
            this.e.writeToParcel(dest, i);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$Empty;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements Mask {

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f50840b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Empty(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        public Empty() {
            this(false);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4 */
        public final int getF50848b() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.f50839a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7 */
        public final int getF50849c() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Empty) && this.f50839a == ((Empty) obj2).f50839a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50839a);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50840b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3 */
        public final int getD() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50839a ? 1 : 0);
        }

        public Empty(boolean z) {
            this.f50839a = z;
            this.f50840b = m.CENTER;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$Face;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Face implements Mask {

        @NotNull
        public static final Parcelable.Creator<Face> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f50841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50843c;
        public final int d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Face(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Face[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Face() {
            int i = 0;
            this(i, i, i, 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4, reason: from getter */
        public final int getF50848b() {
            return this.f50842b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7, reason: from getter */
        public final int getF50849c() {
            return this.f50843c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Face)) {
                return false;
            }
            Face face = (Face) obj2;
            return this.f50841a == face.f50841a && this.f50842b == face.f50842b && this.f50843c == face.f50843c && this.d == face.d && this.e == face.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f50843c, j6.a.b(this.f50842b, this.f50841a.hashCode() * 31, 31), 31), 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50841a;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50841a.name());
            dest.writeInt(this.f50842b);
            dest.writeInt(this.f50843c);
            dest.writeInt(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }

        public Face(m scaleType, int i, int i2, int i3, boolean z) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            this.f50841a = scaleType;
            this.f50842b = i;
            this.f50843c = i2;
            this.d = i3;
            this.e = z;
        }

        public /* synthetic */ Face(int i, int i2, int i3, int i5) {
            this(m.CENTER, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, true);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$FaceZebra;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaceZebra implements Mask {

        @NotNull
        public static final Parcelable.Creator<FaceZebra> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f50844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50846c;
        public final int d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FaceZebra(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FaceZebra[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FaceZebra() {
            int i = 0;
            this(i, i, i, 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4, reason: from getter */
        public final int getF50848b() {
            return this.f50845b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7, reason: from getter */
        public final int getF50849c() {
            return this.f50846c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FaceZebra)) {
                return false;
            }
            FaceZebra faceZebra = (FaceZebra) obj2;
            return this.f50844a == faceZebra.f50844a && this.f50845b == faceZebra.f50845b && this.f50846c == faceZebra.f50846c && this.d == faceZebra.d && this.e == faceZebra.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f50846c, j6.a.b(this.f50845b, this.f50844a.hashCode() * 31, 31), 31), 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50844a;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50844a.name());
            dest.writeInt(this.f50845b);
            dest.writeInt(this.f50846c);
            dest.writeInt(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }

        public FaceZebra(m scaleType, int i, int i2, int i3, boolean z) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            this.f50844a = scaleType;
            this.f50845b = i;
            this.f50846c = i2;
            this.d = i3;
            this.e = z;
        }

        public /* synthetic */ FaceZebra(int i, int i2, int i3, int i5) {
            this(m.CENTER, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, false);
        }
    }

    /* JADX INFO: renamed from: P4 */
    int getF50848b();

    /* JADX INFO: renamed from: U6 */
    boolean getF();

    /* JADX INFO: renamed from: e7 */
    int getF50849c();

    /* JADX INFO: renamed from: n5 */
    m getF50847a();

    /* JADX INFO: renamed from: w3 */
    int getD();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/Mask$QrCode;", "Lcom/revolut/camerakit/ui/models/Mask;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrCode implements Mask {

        @NotNull
        public static final Parcelable.Creator<QrCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f50847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50849c;
        public final int d;
        public final QrCodeMaskModel e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrCode(m.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), QrCodeMaskModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCode[i];
            }
        }

        public QrCode(m scaleType, int i, int i2, int i3, QrCodeMaskModel qrCodeMaskModel, boolean z) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            Intrinsics.checkNotNullParameter(qrCodeMaskModel, "qrCodeMaskModel");
            this.f50847a = scaleType;
            this.f50848b = i;
            this.f50849c = i2;
            this.d = i3;
            this.e = qrCodeMaskModel;
            this.f = z;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: P4, reason: from getter */
        public final int getF50848b() {
            return this.f50848b;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: U6, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: e7, reason: from getter */
        public final int getF50849c() {
            return this.f50849c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrCode)) {
                return false;
            }
            QrCode qrCode = (QrCode) obj2;
            return this.f50847a == qrCode.f50847a && this.f50848b == qrCode.f50848b && this.f50849c == qrCode.f50849c && this.d == qrCode.d && Intrinsics.f(this.e, qrCode.e) && this.f == qrCode.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + ((this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f50849c, j6.a.b(this.f50848b, this.f50847a.hashCode() * 31, 31), 31), 31)) * 31);
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: n5, reason: from getter */
        public final m getF50847a() {
            return this.f50847a;
        }

        @Override // com.revolut.camerakit.ui.models.Mask
        /* JADX INFO: renamed from: w3, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50847a.name());
            dest.writeInt(this.f50848b);
            dest.writeInt(this.f50849c);
            dest.writeInt(this.d);
            this.e.writeToParcel(dest, i);
            dest.writeInt(this.f ? 1 : 0);
        }

        public /* synthetic */ QrCode(m mVar, int i, int i2, int i3, QrCodeMaskModel qrCodeMaskModel, int i5) {
            this((i5 & 1) != 0 ? m.CENTER : mVar, i, i2, i3, qrCodeMaskModel, true);
        }
    }
}
