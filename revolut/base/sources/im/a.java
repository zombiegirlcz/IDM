package im;

import cam.f;
import com.redmadrobot.inputmask.helper.Compiler$FormatError;
import java.util.List;
import km.d;
import km.e;
import km.g;
import km.h;
import km.i;
import km.j;
import km.l;
import km.m;
import km.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162270a;

    public a(List callsToExecute, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(callsToExecute, "callsToExecute");
                this.f162270a = callsToExecute;
                break;
            default:
                Intrinsics.j(callsToExecute, "customNotations");
                this.f162270a = callsToExecute;
                break;
        }
    }

    public f a(String str, boolean z, boolean z3, Character ch5) throws Compiler$FormatError {
        gc0.c iVar;
        if (str.length() == 0) {
            return new km.a(null, false);
        }
        char cP0 = f0.P0(str);
        if (cP0 != '{') {
            if (cP0 != '}') {
                switch (cP0) {
                    case '[':
                        if (ch5 == null || '\\' != ch5.charValue()) {
                            return a(f0.N0(1, str), true, false, Character.valueOf(cP0));
                        }
                        break;
                    case '\\':
                        if (ch5 == null || '\\' != ch5.charValue()) {
                            return a(f0.N0(1, str), z, z3, Character.valueOf(cP0));
                        }
                        break;
                    case ']':
                        if (ch5 == null || '\\' != ch5.charValue()) {
                            return a(f0.N0(1, str), false, false, Character.valueOf(cP0));
                        }
                        break;
                }
            } else if (ch5 == null || '\\' != ch5.charValue()) {
                return a(f0.N0(1, str), false, false, Character.valueOf(cP0));
            }
        } else if (ch5 == null || '\\' != ch5.charValue()) {
            return a(f0.N0(1, str), false, true, Character.valueOf(cP0));
        }
        if (!z) {
            return z3 ? new km.b(a(f0.N0(1, str), false, true, Character.valueOf(cP0)), cP0) : new km.c(a(f0.N0(1, str), false, false, Character.valueOf(cP0)), cP0);
        }
        if (cP0 == '-') {
            return new h(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new d());
        }
        if (cP0 == '0') {
            return new n(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new m());
        }
        if (cP0 == '9') {
            return new h(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new g());
        }
        if (cP0 == 'A') {
            return new n(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new l());
        }
        if (cP0 == '_') {
            return new n(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new i());
        }
        if (cP0 == 'a') {
            return new h(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new km.f());
        }
        if (cP0 != 8230) {
            for (jm.b bVar : this.f162270a) {
                char c2 = bVar.f175892a;
                String str2 = bVar.f175893b;
                if (c2 == cP0) {
                    return bVar.f175894c ? new h(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new e(cP0, str2)) : new n(a(f0.N0(1, str), true, false, Character.valueOf(cP0)), new j(cP0, str2));
                }
            }
            throw new Compiler$FormatError();
        }
        if ((ch5 != null && ch5.charValue() == '0') || (ch5 != null && ch5.charValue() == '9')) {
            iVar = new m();
        } else if ((ch5 != null && ch5.charValue() == 'A') || (ch5 != null && ch5.charValue() == 'a')) {
            iVar = new l();
        } else if ((ch5 != null && ch5.charValue() == '_') || (ch5 != null && ch5.charValue() == '-')) {
            iVar = new i();
        } else if (ch5 != null && ch5.charValue() == 8230) {
            iVar = new i();
        } else {
            if (ch5 == null || ch5.charValue() != '[') {
                throw new Compiler$FormatError();
            }
            iVar = new i();
        }
        return new n(iVar);
    }

    public List b() {
        return this.f162270a;
    }
}
