package meb;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f204646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f204647c;

    public /* synthetic */ f(int i, int i2, int i3) {
        this.f204645a = i3;
        this.f204646b = i;
        this.f204647c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        List listD1;
        switch (this.f204645a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List values = update.f204639b;
                Intrinsics.checkNotNullParameter(values, "values");
                return new a(this.f204646b, values, this.f204647c);
            case 1:
                int i = this.f204646b;
                int i2 = this.f204647c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT id FROM contact ORDER BY id ASC LIMIT ? OFFSET ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, i);
                    sQLiteStatementPrepare.bindLong(2, i2);
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 2:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                int i3 = this.f204646b;
                if (i3 == -1) {
                    return command;
                }
                if (i3 > this.f204647c) {
                    Intrinsics.checkNotNullParameter(command, "<this>");
                    return command instanceof FragmentNavigateCommand ? n.h((FragmentNavigateCommand) command) : command;
                }
                Intrinsics.checkNotNullParameter(command, "<this>");
                return command instanceof FragmentNavigateCommand ? n.g((FragmentNavigateCommand) command) : command;
            default:
                yvk.f update2 = (yvk.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data2 = update2.f317217a;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        List list = (List) content;
                        int size = list.size();
                        int i5 = this.f204646b;
                        if (i5 > size) {
                            return update2;
                        }
                        int size2 = list.size();
                        int i6 = this.f204647c;
                        if (i6 >= size2) {
                            return update2;
                        }
                        ArrayList arrayListF1 = d0.f1(list);
                        arrayListF1.add(i6, arrayListF1.remove(i5));
                        listD1 = d0.d1(arrayListF1);
                    } else {
                        listD1 = null;
                    }
                    data = new Data(listD1, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return yvk.f.a(update2, data, null, 2);
        }
    }
}
