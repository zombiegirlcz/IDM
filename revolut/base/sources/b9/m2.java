package b9;

import android.graphics.Canvas;
import android.graphics.Picture;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f13407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f13408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f13409c;

    /* JADX WARN: Multi-variable type inference failed */
    public static s1 a(q1 q1Var, String str) {
        s1 s1VarA;
        s1 s1Var = (s1) q1Var;
        if (str.equals(s1Var.f13463c)) {
            return s1Var;
        }
        for (Object obj2 : q1Var.getChildren()) {
            if (obj2 instanceof s1) {
                s1 s1Var2 = (s1) obj2;
                if (str.equals(s1Var2.f13463c)) {
                    return s1Var2;
                }
                if ((obj2 instanceof q1) && (s1VarA = a((q1) obj2, str)) != null) {
                    return s1VarA;
                }
            }
        }
        return null;
    }

    public final Picture b(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        zjh.i iVar = new zjh.i(10);
        iVar.q(i, i2);
        new w2(canvasBeginRecording).X(this, iVar);
        picture.endRecording();
        return picture;
    }

    public final s1 c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#")) {
            return null;
        }
        String strSubstring = strReplace.substring(1);
        HashMap map = this.f13409c;
        if (strSubstring == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f13407a.f13463c)) {
            return this.f13407a;
        }
        if (map.containsKey(strSubstring)) {
            return (s1) map.get(strSubstring);
        }
        s1 s1VarA = a(this.f13407a, strSubstring);
        map.put(strSubstring, s1VarA);
        return s1VarA;
    }
}
