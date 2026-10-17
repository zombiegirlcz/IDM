package gzc;

import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f148006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148008c;

    public j(String documentType, File file, String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f148006a = file;
        this.f148007b = documentType;
        this.f148008c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f148006a, jVar.f148006a) && Intrinsics.f(this.f148007b, jVar.f148007b) && Intrinsics.f(this.f148008c, jVar.f148008c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f148006a.hashCode() * 31, 31, this.f148007b);
        String str = this.f148008c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
