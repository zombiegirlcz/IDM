package m30;

import com.revolut.chat.domain.model.LastMessage;
import com.revolut.data.model.Data;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.o0;
import v30.s;
import v30.u0;
import w30.m;
import w30.n;
import w30.w;
import w30.x;
import w30.y;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f202259b;

    public /* synthetic */ a(m mVar, int i) {
        this.f202258a = i;
        this.f202259b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        y xVar;
        switch (this.f202258a) {
            case 0:
                Data detailedChatData = (Data) obj2;
                Intrinsics.checkNotNullParameter(detailedChatData, "detailedChatData");
                v30.j jVar = (v30.j) detailedChatData.getContent();
                if (jVar == null) {
                    return new Data(null, null, true, 3, null);
                }
                m mVar = this.f202259b;
                UUID uuid = mVar.f294092a;
                Instant instant = jVar.f285792m;
                Instant instant2 = jVar.f285793n;
                Instant instant3 = jVar.o;
                Instant instant4 = jVar.f285794p;
                Boolean bool = jVar.f285795q;
                u0 u0Var = jVar.f;
                w wVar = new w(jVar.k, jVar.f285789h, jVar.f285790j);
                o0 o0Var = mVar.i;
                return zi0.c.P(new n(uuid, instant, instant2, instant3, instant4, bool, u0Var, wVar, o0Var != null ? o0Var.f285811b : null, jVar.f285799w, jVar.f285800x, jVar.f285789h, jVar.f285797s, null, mVar.o, mVar.f294101p, 99840), false, null, 3);
            case 1:
                Data detailedChatOptional = (Data) obj2;
                Intrinsics.checkNotNullParameter(detailedChatOptional, "detailedChatOptional");
                Object content = detailedChatOptional.getContent();
                v30.j jVar2 = (v30.j) content;
                if ((jVar2 != null ? jVar2.f285790j : null) == null) {
                    content = null;
                }
                v30.j jVar3 = (v30.j) content;
                if (jVar3 != null) {
                    LastMessage lastMessage = jVar3.f285790j;
                    Intrinsics.h(lastMessage);
                    xVar = new x(jVar3.k, jVar3.f285789h, lastMessage);
                } else {
                    xVar = null;
                }
                m mVar2 = this.f202259b;
                UUID uuid2 = mVar2.f294092a;
                Instant instant5 = mVar2.f294094c;
                Instant instant6 = mVar2.d;
                Instant instant7 = mVar2.e;
                Instant instant8 = mVar2.f;
                Boolean bool2 = mVar2.f294095g;
                if (xVar == null) {
                    xVar = y.b.f294132a;
                }
                y yVar = xVar;
                o0 o0Var2 = mVar2.i;
                return zi0.c.P(new n(uuid2, instant5, instant6, instant7, instant8, bool2, mVar2.f294097j, yVar, o0Var2 != null ? o0Var2.f285811b : null, mVar2.f294098l, mVar2.f294100n, mVar2.k, mVar2.f294099m, s.NONE, mVar2.o, mVar2.f294101p, 67072), false, null, 3);
            default:
                m mVar3 = this.f202259b;
                o0 o0Var3 = mVar3.i;
                Data detailedChatData2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(detailedChatData2, "detailedChatData");
                v30.j jVar4 = (v30.j) detailedChatData2.getContent();
                if (jVar4 == null) {
                    return new Data(null, null, true, 3, null);
                }
                LastMessage lastMessage2 = jVar4.f285790j;
                if (lastMessage2 != null) {
                    return new Data(new n(mVar3.f294092a, jVar4.f285792m, jVar4.f285793n, jVar4.o, jVar4.f285794p, jVar4.f285795q, jVar4.f, new x(jVar4.k, jVar4.f285789h, lastMessage2), o0Var3 != null ? o0Var3.f285811b : null, jVar4.f285799w, jVar4.f285800x, jVar4.f285789h, jVar4.f285797s, null, mVar3.o, mVar3.f294101p, 99840), null, false, 6, null);
                }
                return new Data(new n(mVar3.f294092a, jVar4.f285792m, jVar4.f285793n, jVar4.o, jVar4.f285794p, jVar4.f285795q, jVar4.f, y.a.f294131a, o0Var3 != null ? o0Var3.f285811b : null, jVar4.f285799w, jVar4.f285800x, jVar4.f285789h, jVar4.f285797s, null, mVar3.o, mVar3.f294101p, 99840), null, false, 6, null);
        }
    }
}
