package gzc;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f148031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148033c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f148034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f148035h;

    public r(d answerType, String questionType, String description, String title, boolean z, String fieldName, String str, Map map) {
        Intrinsics.checkNotNullParameter(answerType, "answerType");
        Intrinsics.checkNotNullParameter(questionType, "questionType");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        this.f148031a = answerType;
        this.f148032b = questionType;
        this.f148033c = description;
        this.d = title;
        this.e = z;
        this.f = fieldName;
        this.f148034g = str;
        this.f148035h = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f148031a == rVar.f148031a && Intrinsics.f(this.f148032b, rVar.f148032b) && Intrinsics.f(this.f148033c, rVar.f148033c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f148034g, rVar.f148034g) && Intrinsics.f(this.f148035h, rVar.f148035h);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(this.f148031a.hashCode() * 31, 31, this.f148032b), 31, this.f148033c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f148034g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f148035h;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
