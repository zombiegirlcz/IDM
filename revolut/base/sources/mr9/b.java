package mr9;

import a09.a0;
import er9.e;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import l80.f;
import oq9.u;
import oq9.v;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import pfm.h;
import te0.w;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f208086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f208087c;

    public /* synthetic */ b(d dVar, String str, int i) {
        this.f208085a = i;
        this.f208086b = dVar;
        this.f208087c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f208085a) {
            case 0:
                List reminders = (List) obj2;
                Intrinsics.checkNotNullParameter(reminders, "reminders");
                e eVar = this.f208086b.f208090c;
                eVar.getClass();
                String groupId = this.f208087c;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(reminders, "reminders");
                h hVar = new h(new a0(reminders, 10, eVar, groupId), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return w.g0(hVar);
            case 1:
                List groupReminders = (List) obj2;
                Intrinsics.checkNotNullParameter(groupReminders, "groupReminders");
                d dVar = this.f208086b;
                DateTime compareWith = ((f) dVar.f208089b).g();
                ArrayList<v> arrayList = new ArrayList();
                for (Object obj3 : groupReminders) {
                    v vVar = (v) obj3;
                    Intrinsics.checkNotNullParameter(vVar, "<this>");
                    Intrinsics.checkNotNullParameter(compareWith, "compareWith");
                    if (vVar.a().compareTo((ReadableInstant) compareWith) <= 0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (final v reminder : arrayList) {
                    final e eVar2 = dVar.f208090c;
                    eVar2.getClass();
                    final String groupId2 = this.f208087c;
                    Intrinsics.checkNotNullParameter(groupId2, "groupId");
                    Intrinsics.checkNotNullParameter(reminder, "reminder");
                    final int i = 1;
                    h hVar2 = new h(new kfm.a() { // from class: er9.c
                        @Override // kfm.a
                        public final void run() {
                            switch (i) {
                                case 0:
                                    e eVar3 = eVar2;
                                    ue0.c cVar = eVar3.f128564a;
                                    String str = groupId2;
                                    String strQ = j6.a.q("STORAGE_KEY_REMINDERS", str);
                                    Type remindersType = eVar3.e;
                                    Intrinsics.checkNotNullExpressionValue(remindersType, "remindersType");
                                    eVar3.f128564a.G(d0.F0(br9.j.a(reminder), (List) cVar.v0(f0.f322471a, strQ, remindersType)), j6.a.q("STORAGE_KEY_REMINDERS", str), kii.e.o(fr9.a.class, KTypeProjection.INSTANCE, List.class));
                                    break;
                                default:
                                    e eVar4 = eVar2;
                                    ue0.c cVar2 = eVar4.f128564a;
                                    String str2 = groupId2;
                                    String strQ2 = j6.a.q("STORAGE_KEY_REMINDERS", str2);
                                    Type remindersType2 = eVar4.e;
                                    Intrinsics.checkNotNullExpressionValue(remindersType2, "remindersType");
                                    eVar4.f128564a.G(d0.A0((List) cVar2.v0(f0.f322471a, strQ2, remindersType2), br9.j.a(reminder)), j6.a.q("STORAGE_KEY_REMINDERS", str2), kii.e.o(fr9.a.class, KTypeProjection.INSTANCE, List.class));
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    arrayList2.add(w.g0(hVar2));
                }
                return efm.b.i(arrayList2);
            default:
                final u reminder2 = (u) obj2;
                Intrinsics.checkNotNullParameter(reminder2, "reminder");
                final e eVar3 = this.f208086b.f208090c;
                eVar3.getClass();
                final String groupId3 = this.f208087c;
                Intrinsics.checkNotNullParameter(groupId3, "groupId");
                Intrinsics.checkNotNullParameter(reminder2, "reminder");
                final int i2 = 0;
                h hVar3 = new h(new kfm.a() { // from class: er9.c
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                e eVar32 = eVar3;
                                ue0.c cVar = eVar32.f128564a;
                                String str = groupId3;
                                String strQ = j6.a.q("STORAGE_KEY_REMINDERS", str);
                                Type remindersType = eVar32.e;
                                Intrinsics.checkNotNullExpressionValue(remindersType, "remindersType");
                                eVar32.f128564a.G(d0.F0(br9.j.a(reminder2), (List) cVar.v0(f0.f322471a, strQ, remindersType)), j6.a.q("STORAGE_KEY_REMINDERS", str), kii.e.o(fr9.a.class, KTypeProjection.INSTANCE, List.class));
                                break;
                            default:
                                e eVar4 = eVar3;
                                ue0.c cVar2 = eVar4.f128564a;
                                String str2 = groupId3;
                                String strQ2 = j6.a.q("STORAGE_KEY_REMINDERS", str2);
                                Type remindersType2 = eVar4.e;
                                Intrinsics.checkNotNullExpressionValue(remindersType2, "remindersType");
                                eVar4.f128564a.G(d0.A0((List) cVar2.v0(f0.f322471a, strQ2, remindersType2), br9.j.a(reminder2)), j6.a.q("STORAGE_KEY_REMINDERS", str2), kii.e.o(fr9.a.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return w.g0(hVar3).D(reminder2);
        }
    }
}
