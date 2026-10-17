package uc;

import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f278947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278948b;

    public b(File file, String str) {
        this.f278947a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f278948b = str;
    }

    public final File a() {
        return this.f278947a;
    }

    public final String b() {
        return this.f278948b;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof b) {
            b bVar = (b) obj2;
            if (this.f278947a.equals(bVar.f278947a) && this.f278948b.equals(bVar.f278948b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f278947a.hashCode() ^ 1000003) * 1000003) ^ this.f278948b.hashCode();
    }

    public final String toString() {
        return j6.a.s("SplitFileInfo{splitFile=", this.f278947a.toString(), ", splitId=", this.f278948b, "}");
    }
}
