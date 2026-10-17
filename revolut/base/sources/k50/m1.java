package k50;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f181179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f181180c;
    public final List d;
    public final Boolean e;
    public final v20.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f181181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f181182h;
    public final Map i;

    public m1(List messages, List wsMessages, List gapMessages, List greetingMessages, Boolean bool, v20.n nVar, Map messageExtras, int i, Map failedMessages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(wsMessages, "wsMessages");
        Intrinsics.checkNotNullParameter(gapMessages, "gapMessages");
        Intrinsics.checkNotNullParameter(greetingMessages, "greetingMessages");
        Intrinsics.checkNotNullParameter(messageExtras, "messageExtras");
        Intrinsics.checkNotNullParameter(failedMessages, "failedMessages");
        this.f181178a = messages;
        this.f181179b = wsMessages;
        this.f181180c = gapMessages;
        this.d = greetingMessages;
        this.e = bool;
        this.f = nVar;
        this.f181181g = messageExtras;
        this.f181182h = i;
        this.i = failedMessages;
    }

    public static m1 a(m1 m1Var, ArrayList arrayList, List list, List list2, List list3, Boolean bool, v20.n nVar, Map map, int i, Map map2, int i2) {
        List list4 = arrayList;
        if ((i2 & 1) != 0) {
            list4 = m1Var.f181178a;
        }
        List messages = list4;
        if ((i2 & 2) != 0) {
            list = m1Var.f181179b;
        }
        List wsMessages = list;
        if ((i2 & 4) != 0) {
            list2 = m1Var.f181180c;
        }
        List gapMessages = list2;
        if ((i2 & 8) != 0) {
            list3 = m1Var.d;
        }
        List greetingMessages = list3;
        m1Var.getClass();
        if ((i2 & 32) != 0) {
            bool = m1Var.e;
        }
        Boolean bool2 = bool;
        v20.n nVar2 = (i2 & 64) != 0 ? m1Var.f : nVar;
        Map messageExtras = (i2 & 128) != 0 ? m1Var.f181181g : map;
        int i3 = (i2 & 256) != 0 ? m1Var.f181182h : i;
        Map failedMessages = (i2 & 512) != 0 ? m1Var.i : map2;
        m1Var.getClass();
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(wsMessages, "wsMessages");
        Intrinsics.checkNotNullParameter(gapMessages, "gapMessages");
        Intrinsics.checkNotNullParameter(greetingMessages, "greetingMessages");
        Intrinsics.checkNotNullParameter(messageExtras, "messageExtras");
        Intrinsics.checkNotNullParameter(failedMessages, "failedMessages");
        return new m1(messages, wsMessages, gapMessages, greetingMessages, bool2, nVar2, messageExtras, i3, failedMessages);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f181178a, m1Var.f181178a) && Intrinsics.f(this.f181179b, m1Var.f181179b) && Intrinsics.f(this.f181180c, m1Var.f181180c) && Intrinsics.f(this.d, m1Var.d) && Intrinsics.f(this.e, m1Var.e) && Intrinsics.f(this.f, m1Var.f) && Intrinsics.f(this.f181181g, m1Var.f181181g) && this.f181182h == m1Var.f181182h && Intrinsics.f(this.i, m1Var.i);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(this.f181178a.hashCode() * 31, 31, this.f181179b), 31, this.f181180c), 961, this.d);
        Boolean bool = this.e;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        v20.n nVar = this.f;
        return this.i.hashCode() + j6.a.b(this.f181182h, p.a.e((iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 31, 31, this.f181181g), 31);
    }
}
