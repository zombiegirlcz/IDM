package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowFile;", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowBinary;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowFile extends BackendFlowBinary {

    @NotNull
    public static final Parcelable.Creator<BackendFlowFile> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63280c;
    public final String d;
    public final List e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f63281g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendFlowFile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), e.valueOf(parcel.readString()), (File) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowFile[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackendFlowFile(String id10, String name, String str, List list, e status, File file) {
        super(list);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f63279b = id10;
        this.f63280c = name;
        this.d = str;
        this.e = list;
        this.f = status;
        this.f63281g = file;
    }

    public static BackendFlowFile a(BackendFlowFile backendFlowFile, String str, List list, e eVar, int i) {
        String id10 = backendFlowFile.f63279b;
        String name = backendFlowFile.f63280c;
        if ((i & 4) != 0) {
            str = backendFlowFile.d;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = backendFlowFile.e;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            eVar = backendFlowFile.f;
        }
        e status = eVar;
        File file = backendFlowFile.f63281g;
        backendFlowFile.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(file, "file");
        return new BackendFlowFile(id10, name, str2, list2, status, file);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendFlowFile)) {
            return false;
        }
        BackendFlowFile backendFlowFile = (BackendFlowFile) obj2;
        return Intrinsics.f(this.f63279b, backendFlowFile.f63279b) && Intrinsics.f(this.f63280c, backendFlowFile.f63280c) && Intrinsics.f(this.d, backendFlowFile.d) && Intrinsics.f(this.e, backendFlowFile.e) && this.f == backendFlowFile.f && Intrinsics.f(this.f63281g, backendFlowFile.f63281g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63279b.hashCode() * 31, 31, this.f63280c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        return this.f63281g.hashCode() + ((this.f.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63279b);
        dest.writeString(this.f63280c);
        dest.writeString(this.d);
        dest.writeStringList(this.e);
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f63281g);
    }
}
