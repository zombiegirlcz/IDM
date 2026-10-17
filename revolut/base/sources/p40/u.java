package p40;

import cli.y;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.data.model.Data;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v20.s0;
import v20.t0;
import v30.h0;
import v30.w;
import zhm.a0;
import zhm.b0;
import zhm.d0;
import zhm.f0;
import zhm.w0;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.chat.ui.chat_profile.profile_screen.b f232799w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.chat.ui.chat_profile.profile_screen.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232799w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f232799w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f232799w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((AgentInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Iterable iterableL;
        w uVar;
        w wVar;
        int i = this.u;
        com.revolut.chat.ui.chat_profile.profile_screen.b bVar = this.f232799w;
        switch (i) {
            case 0:
                y yVar = bVar.A;
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) data.getContent();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        List<v20.n> list2 = ((h0) it8.next()).f285777a;
                        ArrayList arrayList2 = new ArrayList();
                        for (v20.n nVar : list2) {
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            if (nVar instanceof s0) {
                                s0 s0Var = (s0) nVar;
                                if (!s0Var.A()) {
                                    if (z50.k.d(s0Var.getMediaType())) {
                                        uVar = new v30.v(s0Var.getId(), s0Var.getTime(), s0Var.getTicketCreatedAt(), s0Var.getServerId(), s0Var.getMediaType(), s0Var.getUploadId(), s0Var.getThumbnailUrl(), s0Var.getThumbnailUrlHeaders(), s0Var.getFilePath());
                                    } else {
                                        UUID id10 = s0Var.getId();
                                        Instant time = s0Var.getTime();
                                        Instant ticketCreatedAt = s0Var.getTicketCreatedAt();
                                        UUID serverId = s0Var.getServerId();
                                        String mediaType = s0Var.getMediaType();
                                        UUID uploadId = s0Var.getUploadId();
                                        String thumbnailUrl = s0Var.getThumbnailUrl();
                                        Map thumbnailUrlHeaders = s0Var.getThumbnailUrlHeaders();
                                        String filePath = s0Var.getFilePath();
                                        t0 meta = s0Var.getMeta();
                                        String fileName = meta != null ? meta.getFileName() : null;
                                        t0 meta2 = s0Var.getMeta();
                                        uVar = new v30.u(id10, time, ticketCreatedAt, serverId, mediaType, uploadId, thumbnailUrl, thumbnailUrlHeaders, filePath, fileName, meta2 != null ? meta2.getFileSize() : null);
                                    }
                                }
                                iterableL = zhm.v.l(uVar);
                            } else if (nVar instanceof v20.c) {
                                v20.c cVar = (v20.c) nVar;
                                kotlin.text.m mVarL = b0.L(cVar.getUploads());
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it9 = mVarL.iterator();
                                while (true) {
                                    ListIterator listIterator = ((w0) it9).f322483a;
                                    if (listIterator.hasPrevious()) {
                                        v20.a aVar2 = (v20.a) listIterator.previous();
                                        String mediaType2 = aVar2.getUpload().getMediaType();
                                        s0.INSTANCE.getClass();
                                        if (s0.Companion.a(mediaType2)) {
                                            wVar = null;
                                        } else {
                                            UUID messageId = aVar2.getMessageId();
                                            if (messageId == null) {
                                                messageId = aVar2.getCorrelationId();
                                            }
                                            UUID uuid = messageId;
                                            UUID messageId2 = aVar2.getMessageId();
                                            if (messageId2 == null) {
                                                messageId2 = cVar.getServerId();
                                            }
                                            UUID uuid2 = messageId2;
                                            if (z50.k.d(mediaType2)) {
                                                Instant time2 = cVar.getTime();
                                                Instant ticketCreatedAt2 = cVar.getTicketCreatedAt();
                                                UUID uploadId2 = aVar2.getUpload().getUploadId();
                                                String thumbnailUrl2 = aVar2.getUpload().getThumbnailUrl();
                                                Map thumbnailUrlHeaders2 = aVar2.getUpload().getThumbnailUrlHeaders();
                                                File file = aVar2.getUpload().i;
                                                uVar = new v30.v(uuid, time2, ticketCreatedAt2, uuid2, mediaType2, uploadId2, thumbnailUrl2, thumbnailUrlHeaders2, file != null ? file.getPath() : null);
                                            } else {
                                                Instant time3 = cVar.getTime();
                                                Instant ticketCreatedAt3 = cVar.getTicketCreatedAt();
                                                UUID uploadId3 = aVar2.getUpload().getUploadId();
                                                String thumbnailUrl3 = aVar2.getUpload().getThumbnailUrl();
                                                Map thumbnailUrlHeaders3 = aVar2.getUpload().getThumbnailUrlHeaders();
                                                File file2 = aVar2.getUpload().i;
                                                uVar = new v30.u(uuid, time3, ticketCreatedAt3, uuid2, mediaType2, uploadId3, thumbnailUrl3, thumbnailUrlHeaders3, file2 != null ? file2.getPath() : null, aVar2.getUpload().getFileName(), aVar2.getUpload().getFileSize());
                                            }
                                            wVar = uVar;
                                        }
                                        if (wVar != null) {
                                            arrayList3.add(wVar);
                                        }
                                    } else {
                                        iterableL = arrayList3;
                                    }
                                }
                            } else {
                                iterableL = f0.f322471a;
                            }
                            a0.x(iterableL, arrayList2);
                        }
                        a0.x(arrayList2, arrayList);
                    }
                    List listP0 = d0.P0(arrayList, new t());
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listP0) {
                        if (obj3 instanceof v30.v) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : listP0) {
                        if (obj4 instanceof v30.u) {
                            arrayList5.add(obj4);
                        }
                    }
                    h0 h0Var = (h0) d0.o0(list);
                    boolean z = false;
                    if (h0Var != null && !h0Var.f285778b) {
                        z = true;
                    }
                    bVar.H2(yVar, new ard.t(data, arrayList4, arrayList5, true ^ z));
                } else if (data.getError() != null) {
                    bVar.H2(yVar, new nd8.l(data.getError(), 6));
                } else if (data.getLoading()) {
                    bVar.H2(yVar, new p0g.b(27));
                }
                break;
            default:
                AgentInfo agentInfo = (AgentInfo) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.A, new g40.k(agentInfo, 1));
                break;
        }
        return Unit.f186387a;
    }
}
