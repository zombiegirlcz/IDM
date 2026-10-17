package zr8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.text.a0;
import le.u1;
import org.joda.time.DateTime;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, vr8.a.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        mr8.d dVar;
        mr8.c cVar;
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Map map = vr8.a.f291516a;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List list = p0;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            wr8.b bVar = (wr8.b) it8.next();
            Intrinsics.checkNotNullParameter(bVar, str);
            String id10 = bVar.getId();
            dj0.d dVarO = mo3.a.o(bVar.getAmount());
            mr8.e eVar = (mr8.e) u1.u(bVar.getState(), vr8.a.f291516a);
            DateTime dateTime = new DateTime(bVar.getCreatedDate());
            String transactionId = bVar.getTransactionId();
            String transactionWalletId = bVar.getTransactionWalletId();
            String transactionPocketId = bVar.getTransactionPocketId();
            String comment = bVar.getComment();
            String gif2 = bVar.getGif();
            wr8.a sender = bVar.getSender();
            Iterator it9 = it8;
            String str2 = str;
            mr8.a aVar = new mr8.a(sender.getId(), sender.getFirstName(), sender.getLastName());
            wr8.a recipient = bVar.getRecipient();
            mr8.a aVar2 = new mr8.a(recipient.getId(), recipient.getFirstName(), recipient.getLastName());
            wr8.c reason = bVar.getReason();
            if (reason != null) {
                String code = reason.getCode();
                mr8.c[] cVarArrValues = mr8.c.values();
                int length = cVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArrValues[i];
                    int i2 = length;
                    int i3 = i;
                    if (a0.z(cVar.name(), code, true)) {
                        break;
                    }
                    i = i3 + 1;
                    length = i2;
                }
                if (cVar == null) {
                    cVar = mr8.c.FIRST_TRANSFER_BETWEEN;
                }
                mr8.c cVar2 = cVar;
                jo3.a limit = reason.getLimit();
                dVar = new mr8.d(cVar2, limit != null ? mo3.a.o(limit) : null);
            } else {
                dVar = null;
            }
            arrayList.add(new mr8.b(id10, dVarO, eVar, dateTime, transactionId, transactionWalletId, transactionPocketId, comment, gif2, aVar, aVar2, dVar));
            it8 = it9;
            str = str2;
        }
        return arrayList;
    }
}
