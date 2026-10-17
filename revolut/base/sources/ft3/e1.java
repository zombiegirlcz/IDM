package ft3;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f137819b;

    public /* synthetic */ e1(d1 d1Var, int i) {
        this.f137818a = i;
        this.f137819b = d1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        Object next2;
        switch (this.f137818a) {
            case 0:
                Iterator it8 = g1.f137832a.entrySet().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((d1) ((Map.Entry) next).getValue()).f137810a == this.f137819b.f137810a) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    return (String) entry.getKey();
                }
                return null;
            default:
                Iterator it9 = g1.f137832a.entrySet().iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (((d1) ((Map.Entry) next2).getValue()).f137810a == this.f137819b.f137810a) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                Map.Entry entry2 = (Map.Entry) next2;
                if (entry2 != null) {
                    return (String) entry2.getKey();
                }
                return null;
        }
    }
}
