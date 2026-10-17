package wlm;

import ch.qos.logback.core.CoreConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import mmm.h0;
import mmm.s0;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f298543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f298544c;
    public final ArrayList d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f298545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f298546h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f298547j;

    public j(o oVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f298547j = oVar;
        this.f298542a = key;
        oVar.getClass();
        this.f298543b = new long[2];
        this.f298544c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb6 = new StringBuilder(key);
        sb6.append(CoreConstants.DOT);
        int length = sb6.length();
        for (int i = 0; i < 2; i++) {
            sb6.append(i);
            ArrayList arrayList = this.f298544c;
            h0 h0Var = this.f298547j.f298557a;
            String string = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(h0Var.e(string));
            sb6.append(".tmp");
            ArrayList arrayList2 = this.d;
            h0 h0Var2 = this.f298547j.f298557a;
            String string2 = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList2.add(h0Var2.e(string2));
            sb6.setLength(length);
        }
    }

    public final k a() {
        TimeZone timeZone = vlm.j.f290512a;
        if (!this.e) {
            return null;
        }
        o oVar = this.f298547j;
        if (!oVar.f298563l && (this.f298545g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f298543b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                s0 s0VarT = oVar.f298558b.t((h0) this.f298544c.get(i));
                if (!oVar.f298563l) {
                    this.f298546h++;
                    s0VarT = new i(s0VarT, oVar, this);
                }
                arrayList.add(s0VarT);
            } catch (FileNotFoundException unused) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    vlm.h.f((s0) it8.next());
                }
                try {
                    oVar.p(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new k(this.f298547j, this.f298542a, this.i, arrayList, jArr);
    }
}
