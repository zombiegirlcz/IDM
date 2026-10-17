package kem;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f183220b;

    public o(String content, List parameters) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f183219a = content;
        this.f183220b = parameters;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = this.f183220b;
        int iJ = zhm.v.j(list);
        if (iJ < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            m mVar = (m) list.get(i);
            if (kotlin.text.a0.z(mVar.f183214a, name, true)) {
                return mVar.f183215b;
            }
            if (i == iJ) {
                return null;
            }
            i++;
        }
    }

    public final String toString() {
        List<m> list = this.f183220b;
        boolean zIsEmpty = list.isEmpty();
        String str = this.f183219a;
        if (zIsEmpty) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int length2 = 0;
        for (m mVar : list) {
            length2 += mVar.f183214a.length() + mVar.f183215b.length() + 3;
        }
        StringBuilder sb6 = new StringBuilder(length + length2);
        sb6.append(str);
        int iJ = zhm.v.j(list);
        if (iJ >= 0) {
            while (true) {
                m mVar2 = (m) list.get(i);
                sb6.append("; ");
                sb6.append(mVar2.f183214a);
                sb6.append("=");
                String str2 = mVar2.f183215b;
                if (p.a(str2)) {
                    sb6.append(p.b(str2));
                } else {
                    sb6.append(str2);
                }
                if (i == iJ) {
                    break;
                }
                i++;
            }
        }
        String string = sb6.toString();
        Intrinsics.h(string);
        return string;
    }
}
