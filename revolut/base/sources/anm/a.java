package anm;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7821b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7822c;

    public a(b[] bVarArr) {
        this.f7822c = (b[]) ((Object[]) bVarArr.clone());
    }

    @Override // anm.b
    public final int a(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        int i2;
        switch (this.f7821b) {
            case 0:
                for (b bVar : (b[]) this.f7822c) {
                    int iA = bVar.a(charSequence, i, stringWriter);
                    if (iA != 0) {
                        return iA;
                    }
                }
                return 0;
            default:
                EnumSet enumSet = (EnumSet) this.f7822c;
                int length = charSequence.length();
                if (charSequence.charAt(i) != '&' || i >= length - 2 || charSequence.charAt(i + 1) != '#') {
                    return 0;
                }
                int i3 = i + 2;
                char cCharAt = charSequence.charAt(i3);
                if (cCharAt == 'x' || cCharAt == 'X') {
                    i3 = i + 3;
                    if (i3 == length) {
                        return 0;
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i5 = i3;
                while (i5 < length && ((charSequence.charAt(i5) >= '0' && charSequence.charAt(i5) <= '9') || ((charSequence.charAt(i5) >= 'a' && charSequence.charAt(i5) <= 'f') || (charSequence.charAt(i5) >= 'A' && charSequence.charAt(i5) <= 'F')))) {
                    i5++;
                }
                int i6 = (i5 == length || charSequence.charAt(i5) != ';') ? 0 : 1;
                if (i6 == 0) {
                    h hVar = h.semiColonRequired;
                    if (enumSet != null && enumSet.contains(hVar)) {
                        return 0;
                    }
                    h hVar2 = h.errorIfNoSemiColon;
                    if (enumSet != null && enumSet.contains(hVar2)) {
                        throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                    }
                }
                try {
                    int i21 = i2 != 0 ? Integer.parseInt(charSequence.subSequence(i3, i5).toString(), 16) : Integer.parseInt(charSequence.subSequence(i3, i5).toString(), 10);
                    if (i21 > 65535) {
                        char[] chars = Character.toChars(i21);
                        stringWriter.write(chars[0]);
                        stringWriter.write(chars[1]);
                    } else {
                        stringWriter.write(i21);
                    }
                    return ((i5 + 2) - i3) + i2 + i6;
                } catch (NumberFormatException unused) {
                    return 0;
                }
        }
    }

    public a(h[] hVarArr) {
        if (hVarArr.length > 0) {
            this.f7822c = EnumSet.copyOf((Collection) Arrays.asList(hVarArr));
        } else {
            this.f7822c = EnumSet.copyOf((Collection) Collections.singletonList(h.semiColonRequired));
        }
    }
}
