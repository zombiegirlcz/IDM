package xif;

import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nif.l2;
import nif.m2;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mif.h f306383a;

    public u(mif.h searchIndexDao) {
        Intrinsics.checkNotNullParameter(searchIndexDao, "searchIndexDao");
        this.f306383a = searchIndexDao;
    }

    public final Object a(List list, gim.i iVar) {
        List<qjf.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (qjf.a aVar : list2) {
            arrayList.add(new l2(aVar.f246860a, aVar.f246861b));
        }
        mif.h hVar = this.f306383a;
        hVar.getClass();
        Object objPerformSuspending = DBUtil.performSuspending(hVar.f205798a, false, true, new ma2.s(hVar, arrayList, 24), iVar);
        return objPerformSuspending == fim.a.COROUTINE_SUSPENDED ? objPerformSuspending : Unit.f186387a;
    }

    public final Unit b(Boolean bool) {
        Long l2;
        if (bool != null) {
            l2 = new Long(bool.booleanValue() ? 1L : 0L);
        } else {
            l2 = null;
        }
        this.f306383a.c(new m2(4, l2, "FORCE_EXCLUSIVE_ID", null));
        return Unit.f186387a;
    }

    public final Unit c(DateTime dateTime) {
        this.f306383a.c(new m2(4, dateTime != null ? new Long(dateTime.getMillis()) : null, "LAST_STARTED_DATE_ID", null));
        return Unit.f186387a;
    }
}
