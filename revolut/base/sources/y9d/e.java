package y9d;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import wim.z;
import wtc.b0;
import y8a.h;
import y99.x;
import ybh.c0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f311837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f311838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f311839c;
    public final ue0.c d;
    public volatile boolean e;
    public final ReentrantReadWriteLock f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantReadWriteLock f311840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f311841h;
    public final x4l.c i;

    public e(c0 dataProvider, zk0.b fileSystemRepository, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f311837a = dataProvider;
        this.f311838b = fileSystemRepository;
        this.f311839c = memoryCache;
        this.d = storage;
        this.f = new ReentrantReadWriteLock();
        this.f311840g = new ReentrantReadWriteLock();
        Continuation continuation = null;
        final int i = 1;
        this.f311841h = new x4l.c(new b0(this, continuation, 12), new Function1(this) { // from class: y9d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f311832b;

            {
                this.f311832b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List list;
                switch (i) {
                    case 0:
                        e eVar = this.f311832b;
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        eVar.f.readLock().lock();
                        try {
                            List list2 = (List) eVar.f311839c.get("invoices:templates:memory");
                            Object obj3 = null;
                            if (list2 != null) {
                                Iterator it8 = list2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        Object next = it8.next();
                                        if (Intrinsics.f(((InvoiceTemplate) next).f86397a, id10)) {
                                            obj3 = next;
                                        }
                                    }
                                }
                                obj3 = (InvoiceTemplate) obj3;
                                break;
                            }
                            return obj3;
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    default:
                        e eVar2 = this.f311832b;
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ReentrantReadWriteLock.ReadLock lock = eVar2.f.readLock();
                        lock.lock();
                        try {
                            if (eVar2.e) {
                                list = (List) eVar2.f311839c.get("invoices:templates:memory");
                                break;
                            } else {
                                list = null;
                            }
                            return list;
                        } finally {
                            lock.unlock();
                        }
                }
            }
        }, new Function2(this) { // from class: y9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f311834b;

            {
                this.f311834b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = 0;
                switch (i) {
                    case 0:
                        e eVar = this.f311834b;
                        String id10 = (String) obj2;
                        InvoiceTemplate template = (InvoiceTemplate) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(template, "template");
                        ReentrantReadWriteLock reentrantReadWriteLock = eVar.f;
                        j jVar = eVar.f311839c;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i3 = 0; i3 < readHoldCount; i3++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            List list = (List) jVar.get("invoices:templates:memory");
                            if (list == null) {
                                list = f0.f322471a;
                            }
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i5 = -1;
                                } else if (!Intrinsics.f(((InvoiceTemplate) it8.next()).f86397a, id10)) {
                                    i5++;
                                }
                            }
                            if (i5 >= 0) {
                                arrayListF1.set(i5, template);
                            } else {
                                arrayListF1.add(size, template);
                            }
                            jVar.f("invoices:templates:memory", arrayListF1);
                            Unit unit = Unit.f186387a;
                            while (i2 < readHoldCount) {
                                lock.lock();
                                i2++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i2 < readHoldCount) {
                                lock.lock();
                                i2++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        e eVar2 = this.f311834b;
                        List templates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        ReentrantReadWriteLock reentrantReadWriteLock2 = eVar2.f;
                        ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                        int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                        for (int i6 = 0; i6 < readHoldCount2; i6++) {
                            lock2.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                        writeLock2.lock();
                        try {
                            eVar2.f311839c.f("invoices:templates:memory", templates);
                            eVar2.e = true;
                            Unit unit2 = Unit.f186387a;
                            while (i2 < readHoldCount2) {
                                lock2.lock();
                                i2++;
                            }
                            writeLock2.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th11) {
                            while (i2 < readHoldCount2) {
                                lock2.lock();
                                i2++;
                            }
                            writeLock2.unlock();
                            throw th11;
                        }
                }
            }
        }, new y5g.d(this, continuation, 7), new wa7.j(this, continuation, 19));
        final int i2 = 0;
        this.i = new x4l.c(new y5b.b0(this, continuation, 2), new Function1(this) { // from class: y9d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f311832b;

            {
                this.f311832b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List list;
                switch (i2) {
                    case 0:
                        e eVar = this.f311832b;
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        eVar.f.readLock().lock();
                        try {
                            List list2 = (List) eVar.f311839c.get("invoices:templates:memory");
                            Object obj3 = null;
                            if (list2 != null) {
                                Iterator it8 = list2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        Object next = it8.next();
                                        if (Intrinsics.f(((InvoiceTemplate) next).f86397a, id10)) {
                                            obj3 = next;
                                        }
                                    }
                                }
                                obj3 = (InvoiceTemplate) obj3;
                                break;
                            }
                            return obj3;
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    default:
                        e eVar2 = this.f311832b;
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        ReentrantReadWriteLock.ReadLock lock = eVar2.f.readLock();
                        lock.lock();
                        try {
                            if (eVar2.e) {
                                list = (List) eVar2.f311839c.get("invoices:templates:memory");
                                break;
                            } else {
                                list = null;
                            }
                            return list;
                        } finally {
                            lock.unlock();
                        }
                }
            }
        }, new Function2(this) { // from class: y9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f311834b;

            {
                this.f311834b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = 0;
                switch (i2) {
                    case 0:
                        e eVar = this.f311834b;
                        String id10 = (String) obj2;
                        InvoiceTemplate template = (InvoiceTemplate) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(template, "template");
                        ReentrantReadWriteLock reentrantReadWriteLock = eVar.f;
                        j jVar = eVar.f311839c;
                        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i3 = 0; i3 < readHoldCount; i3++) {
                            lock.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            List list = (List) jVar.get("invoices:templates:memory");
                            if (list == null) {
                                list = f0.f322471a;
                            }
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i5 = -1;
                                } else if (!Intrinsics.f(((InvoiceTemplate) it8.next()).f86397a, id10)) {
                                    i5++;
                                }
                            }
                            if (i5 >= 0) {
                                arrayListF1.set(i5, template);
                            } else {
                                arrayListF1.add(size, template);
                            }
                            jVar.f("invoices:templates:memory", arrayListF1);
                            Unit unit = Unit.f186387a;
                            while (i22 < readHoldCount) {
                                lock.lock();
                                i22++;
                            }
                            writeLock.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th10) {
                            while (i22 < readHoldCount) {
                                lock.lock();
                                i22++;
                            }
                            writeLock.unlock();
                            throw th10;
                        }
                    default:
                        e eVar2 = this.f311834b;
                        List templates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(templates, "templates");
                        ReentrantReadWriteLock reentrantReadWriteLock2 = eVar2.f;
                        ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                        int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                        for (int i6 = 0; i6 < readHoldCount2; i6++) {
                            lock2.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                        writeLock2.lock();
                        try {
                            eVar2.f311839c.f("invoices:templates:memory", templates);
                            eVar2.e = true;
                            Unit unit2 = Unit.f186387a;
                            while (i22 < readHoldCount2) {
                                lock2.lock();
                                i22++;
                            }
                            writeLock2.unlock();
                            return Unit.f186387a;
                        } catch (Throwable th11) {
                            while (i22 < readHoldCount2) {
                                lock2.lock();
                                i22++;
                            }
                            writeLock2.unlock();
                            throw th11;
                        }
                }
            }
        }, new y83.d(this, continuation, 3), new y69.e(this, continuation, 1));
    }

    /* JADX WARN: Finally extract failed */
    public static final void a(e eVar, InvoiceTemplate invoiceTemplate) {
        int i;
        j jVar = eVar.f311839c;
        ue0.c cVar = eVar.d;
        ReentrantReadWriteLock reentrantReadWriteLock = eVar.f311840g;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KType kTypeB = o0.b(r9d.b.class);
            companion.getClass();
            List list = (List) cVar.T2("invoices:templates:storage", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
            if (list == null) {
                list = f0.f322471a;
            }
            r9d.b bVarC = x9d.a.c(invoiceTemplate);
            String str = invoiceTemplate.f86397a;
            int size = list.size();
            ArrayList arrayListF1 = d0.f1(list);
            Iterator it8 = arrayListF1.iterator();
            int i3 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (Intrinsics.f(((r9d.b) it8.next()).getId(), str)) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
            }
            if (i >= 0) {
                arrayListF1.set(i, bVarC);
            } else {
                arrayListF1.add(size, bVarC);
            }
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KType kTypeB2 = o0.b(r9d.b.class);
            companion2.getClass();
            cVar.G(arrayListF1, "invoices:templates:storage", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB2))));
            Unit unit = Unit.f186387a;
            for (int i5 = 0; i5 < readHoldCount; i5++) {
                lock.lock();
            }
            writeLock.unlock();
            ReentrantReadWriteLock reentrantReadWriteLock2 = eVar.f;
            lock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i6 = 0; i6 < readHoldCount; i6++) {
                lock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                List list2 = (List) jVar.get("invoices:templates:memory");
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                int size2 = list2.size();
                ArrayList arrayListF12 = d0.f1(list2);
                Iterator it9 = arrayListF12.iterator();
                int i21 = 0;
                while (true) {
                    if (!it9.hasNext()) {
                        i21 = -1;
                        break;
                    } else if (Intrinsics.f(((InvoiceTemplate) it9.next()).f86397a, str)) {
                        break;
                    } else {
                        i21++;
                    }
                }
                if (i21 >= 0) {
                    arrayListF12.set(i21, invoiceTemplate);
                } else {
                    arrayListF12.add(size2, invoiceTemplate);
                }
                jVar.f("invoices:templates:memory", arrayListF12);
                for (int i22 = 0; i22 < readHoldCount; i22++) {
                    lock.lock();
                }
                writeLock.unlock();
                int i32 = 3;
                x4l.c.a(eVar.f311841h, new x(i32));
                x4l.c.a(eVar.i, new h(invoiceTemplate, i32));
            } finally {
                for (int i33 = 0; i33 < readHoldCount; i33++) {
                    lock.lock();
                }
                writeLock.unlock();
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
