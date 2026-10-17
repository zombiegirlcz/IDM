package k50;

import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class h3 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f181099b;

    public /* synthetic */ h3(j4 j4Var, int i) {
        this.f181098a = i;
        this.f181099b = j4Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        List messages;
        switch (this.f181098a) {
            case 0:
                Data data = (Data) obj2;
                v50.a aVar = (v50.a) data.getContent();
                List list = null;
                j4 j4Var = this.f181099b;
                if (aVar != null && (messages = aVar.getMessages()) != null) {
                    List<String> list2 = messages;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    for (String str : list2) {
                        v50.a aVar2 = (v50.a) data.getContent();
                        UUID authorId = aVar2 != null ? aVar2.getAuthorId() : null;
                        df0.b bVar = j4Var.U;
                        i90.b bVar2 = j4Var.R;
                        if (authorId == null) {
                            authorId = bVar2.a();
                        }
                        ChatAgent.Bot bot = new ChatAgent.Bot(authorId);
                        UUID uuid = j4.B0;
                        UUID uuidA = bVar2.a();
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(bVar.a().toEpochMilli());
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                        v20.b1 b1Var = v20.b1.IN_PROGRESS;
                        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(bVar.a().toEpochMilli());
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
                        arrayList.add(new v20.o2(uuidA, instantOfEpochMilli, bot, uuid, instantOfEpochMilli2, str, null, null, null, false, null, b1Var, null, null, null, null, j4Var.e3(), null, 188416));
                    }
                    list = arrayList;
                }
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                j4Var.H2(j4Var.f181140w0, new j2(j4Var, list, 1));
                break;
            default:
                Data data2 = (Data) obj2;
                v30.j jVar = (v30.j) data2.getContent();
                j4 j4Var2 = this.f181099b;
                cli.y yVar = j4Var2.f181140w0;
                j4Var2.H2(yVar, new f3(j4Var2, data2));
                if (jVar != null) {
                    j4Var2.j0.setValue(jVar.f285785a);
                }
                j4Var2.H2(yVar, new n2(jVar, 0));
                if (jVar != null && !data2.getLoading()) {
                    j4.Q2(j4Var2, jVar);
                }
                j4Var2.z3();
                break;
        }
        return Unit.f186387a;
    }
}
