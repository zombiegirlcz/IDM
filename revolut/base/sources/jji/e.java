package jji;

import java.io.File;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f174962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f174963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f174964c;
    public Object d;

    public e(cam.f state, Character ch5, boolean z, Character ch9) {
        Intrinsics.j(state, "state");
        this.f174963b = state;
        this.f174964c = ch5;
        this.f174962a = z;
        this.d = ch9;
    }

    public static String f(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb6 = new StringBuilder(length - i);
        sb6.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb6.append((CharSequence) str, i, length);
                break;
            }
            sb6.append(lowerCase2);
        }
        return sb6.toString();
    }

    public static String g(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb6 = new StringBuilder(length - i);
        sb6.append(lowerCase);
        sb6.append((CharSequence) str, i2, length);
        return sb6.toString();
    }

    public void a() {
        z7.c.d((z7.c) this.d, this, false);
    }

    public String b(p9.g gVar, String str) {
        String str2 = (String) this.f174964c;
        if (str2 == null) {
            return null;
        }
        Class<?> returnType = gVar.e.getReturnType();
        if ((returnType == Boolean.class || returnType == Boolean.TYPE) && str.startsWith(str2)) {
            return this.f174962a ? g(2, str) : f(2, str);
        }
        return null;
    }

    public String c(String str) {
        String str2 = (String) this.d;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.f174962a ? g(str2.length(), str) : f(str2.length(), str);
    }

    public String d(p9.g gVar, String str) {
        Method method = gVar.e;
        String str2 = (String) this.f174963b;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isArray()) {
                String name = returnType.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    return null;
                }
            }
        } else if ("getMetaClass".equals(str) && method.getReturnType().getName().startsWith("groovy.lang")) {
            return null;
        }
        return this.f174962a ? g(str2.length(), str) : f(str2.length(), str);
    }

    public File e() {
        File file;
        synchronized (((z7.c) this.d)) {
            try {
                z7.b bVar = (z7.b) this.f174963b;
                if (bVar.f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.e) {
                    ((boolean[]) this.f174964c)[0] = true;
                }
                file = bVar.d[0];
                ((z7.c) this.d).f319836a.mkdirs();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return file;
    }

    public e(k9.t tVar, String str) {
        this.f174962a = k9.l.USE_STD_BEAN_NAMING.c(tVar.f203598a);
        this.d = str;
        this.f174963b = "get";
        this.f174964c = "is";
    }

    public e(z7.c cVar, z7.b bVar) {
        this.d = cVar;
        this.f174963b = bVar;
        this.f174964c = bVar.e ? null : new boolean[cVar.f319839g];
    }
}
