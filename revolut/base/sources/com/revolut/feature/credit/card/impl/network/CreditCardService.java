package com.revolut.feature.credit.card.impl.network;

import efm.d0;
import en4.e;
import en4.f;
import fn4.c;
import hn4.g;
import hn4.h;
import ib.b;
import in4.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import on4.k;
import org.jetbrains.annotations.NotNull;
import q90.i;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ro4.d;
import yn4.a0;
import yn4.b0;
import yn4.c0;
import yn4.e0;
import yn4.f0;
import yn4.g0;
import yn4.h0;
import yn4.n;
import yn4.q;
import yn4.s;
import yn4.t;
import yn4.u;
import yn4.v;
import yn4.w;
import yn4.y;
import yn4.z;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000Â\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000bJ&\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0007J$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u000bJ$\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0007J\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020!H§@¢\u0006\u0004\b\"\u0010#J0\u0010(\u001a\u00020'2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020\u00022\n\b\u0001\u0010&\u001a\u0004\u0018\u00010%H§@¢\u0006\u0004\b(\u0010)J \u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010\u0007J$\u0010.\u001a\u00020-2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\u0002H§@¢\u0006\u0004\b.\u0010\u000bJ\u001a\u00100\u001a\u00020/2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b0\u0010\u0007J$\u00103\u001a\u0002022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020\u0002H§@¢\u0006\u0004\b3\u0010\u000bJ\u001a\u00105\u001a\u0002042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b5\u0010\u0007J\u001a\u00107\u001a\u0002062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b7\u0010\u0007J \u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b9\u0010\u0007J\u001a\u0010<\u001a\u00020;2\b\b\u0001\u0010:\u001a\u00020\u0002H§@¢\u0006\u0004\b<\u0010\u0007J0\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020A2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bB\u0010\u0007J\u001a\u0010C\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bC\u0010\u0007J\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bF\u0010GJ)\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010H\u001a\u00020EH'¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010DH'¢\u0006\u0004\bK\u0010LJ\u001a\u0010N\u001a\u00020M2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bN\u0010\u0007J\u001a\u0010O\u001a\u00020M2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bO\u0010\u0007J\u001a\u0010Q\u001a\u00020P2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bQ\u0010\u0007J6\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010S\u001a\u00020R2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bV\u0010WJ$\u0010Z\u001a\u00020Y2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020XH§@¢\u0006\u0004\bZ\u0010[J \u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b]\u0010\u0007J$\u0010`\u001a\u00020_2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H§@¢\u0006\u0004\b`\u0010\u000bJ$\u0010a\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H§@¢\u0006\u0004\ba\u0010\u000bJ$\u0010b\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H§@¢\u0006\u0004\bb\u0010\u000bJ8\u0010e\u001a\u00020d2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u00022\b\b\u0001\u0010S\u001a\u00020R2\b\b\u0001\u0010c\u001a\u00020\u0002H§@¢\u0006\u0004\be\u0010fJ.\u0010i\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u00022\b\b\u0001\u0010h\u001a\u00020gH§@¢\u0006\u0004\bi\u0010jJ$\u0010l\u001a\u00020k2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H§@¢\u0006\u0004\bl\u0010\u000bJ.\u0010n\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u00022\b\b\u0001\u0010h\u001a\u00020mH§@¢\u0006\u0004\bn\u0010oJ.\u0010q\u001a\u00020p2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\bq\u0010rJ.\u0010t\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u00022\b\b\u0001\u0010h\u001a\u00020sH§@¢\u0006\u0004\bt\u0010uJ$\u0010w\u001a\u00020v2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H§@¢\u0006\u0004\bw\u0010\u000bJ.\u0010y\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u00022\b\b\u0001\u0010h\u001a\u00020xH§@¢\u0006\u0004\by\u0010zJ\u001a\u0010|\u001a\u00020{2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b|\u0010\u0007J+\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010}\u001a\u00020RH§@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J(\u0010\u0082\u0001\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010h\u001a\u00030\u0081\u0001H§@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J'\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0085\u0001\u0010\u000bJ'\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010^\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0087\u0001\u0010\u000bJ\u001d\u0010\u0089\u0001\u001a\u00030\u0088\u00012\b\b\u0001\u0010:\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0089\u0001\u0010\u0007JC\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020U0\u00042\b\b\u0001\u0010:\u001a\u00020\u00022\b\b\u0001\u0010S\u001a\u00020R2\b\b\u0001\u0010c\u001a\u00020\u00022\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001d\u0010\u008d\u0001\u001a\u00030\u008c\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008d\u0001\u0010\u0007J6\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010h\u001a\u00030\u008e\u00012\u000b\b\u0001\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J#\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0093\u0001\u0010\u0007J(\u0010\u0095\u0001\u001a\u00030\u0090\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u0094\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0095\u0001\u0010\u000bJ'\u0010\u0096\u0001\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u0094\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0096\u0001\u0010\u000bJ5\u0010\u0099\u0001\u001a\u00020\u001e2\u000b\b\u0001\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010h\u001a\u00030\u0098\u0001H§@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J5\u0010\u009c\u0001\u001a\u00020\u001e2\u000b\b\u0001\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010h\u001a\u00030\u009b\u0001H§@¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001d\u0010\u009f\u0001\u001a\u00030\u009e\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009f\u0001\u0010\u0007J\u001d\u0010¡\u0001\u001a\u00030 \u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b¡\u0001\u0010\u0007J\u001d\u0010£\u0001\u001a\u00030¢\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b£\u0001\u0010\u0007J\u001d\u0010¥\u0001\u001a\u00030¤\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b¥\u0001\u0010\u0007J(\u0010¨\u0001\u001a\u00030§\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010¦\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¨\u0001\u0010\u000bJ4\u0010«\u0001\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010¦\u0001\u001a\u00020\u00022\n\b\u0001\u0010ª\u0001\u001a\u00030©\u0001H§@¢\u0006\u0006\b«\u0001\u0010¬\u0001J.\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010¦\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b®\u0001\u0010\u000bJ'\u0010¯\u0001\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010¦\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b¯\u0001\u0010\u000bJ\u001c\u0010°\u0001\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b°\u0001\u0010\u0007J*\u0010³\u0001\u001a\u00030²\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000b\b\u0001\u0010±\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b³\u0001\u0010\u000bJ\u001d\u0010µ\u0001\u001a\u00030´\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bµ\u0001\u0010\u0007J6\u0010¸\u0001\u001a\u00030·\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u001d\u001a\u00030¶\u00012\u000b\b\u0001\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001d\u0010»\u0001\u001a\u00030º\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b»\u0001\u0010\u0007J\u001d\u0010½\u0001\u001a\u00030¼\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b½\u0001\u0010\u0007J\u001d\u0010¿\u0001\u001a\u00030¾\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\b¿\u0001\u0010\u0007J#\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÁ\u0001\u0010\u0007J(\u0010Ã\u0001\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010h\u001a\u00030Â\u0001H§@¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001d\u0010Æ\u0001\u001a\u00030Å\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÆ\u0001\u0010\u0007J)\u0010É\u0001\u001a\u00030È\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010Ç\u0001\u001a\u00020RH§@¢\u0006\u0006\bÉ\u0001\u0010\u0080\u0001J*\u0010Ë\u0001\u001a\u00030Å\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010Ç\u0001\u001a\u00030Ê\u0001H§@¢\u0006\u0006\bË\u0001\u0010Ì\u0001J(\u0010Î\u0001\u001a\u00030Í\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010S\u001a\u00020RH§@¢\u0006\u0006\bÎ\u0001\u0010\u0080\u0001J\u001d\u0010Ð\u0001\u001a\u00030Ï\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÐ\u0001\u0010\u0007J(\u0010Ò\u0001\u001a\u00030Ñ\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010S\u001a\u00020RH§@¢\u0006\u0006\bÒ\u0001\u0010\u0080\u0001J4\u0010Õ\u0001\u001a\u00030Ô\u00012\t\b\u0001\u0010\u008f\u0001\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010h\u001a\u00030Ó\u0001H§@¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J(\u0010Ù\u0001\u001a\u00030Ø\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010×\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bÙ\u0001\u0010\u000bJ\u001d\u0010Û\u0001\u001a\u00030Ú\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÛ\u0001\u0010\u0007J\u001d\u0010Ý\u0001\u001a\u00030Ü\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0005\bÝ\u0001\u0010\u0007J(\u0010à\u0001\u001a\u00030ß\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010Þ\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bà\u0001\u0010\u000b¨\u0006á\u0001À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/impl/network/CreditCardService;", "", "", "facilityId", "", "Lon4/b;", "getCreditCardFeatures", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature", "Lon4/k;", "getCreditCardFeatureConfig", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dialogType", "Lio4/g;", "getCreditCardDialog", "paymentOption", "Lon4/h;", "getCreditPaymentInfo", "Lrn4/c;", "getCreditManagementInfo", "transactionId", "Lvo4/a;", "getTransactionDetails", "type", "Ldo4/a;", "getCreditCardLimits", "Lbo4/a;", "getCreditLimitHistory", "Lqn4/a;", "request", "", "topupCredit", "(Lqn4/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldn4/a;", "linkCardToCredit", "(Ljava/lang/String;Ldn4/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "format", "", "limit", "Lrn4/f;", "getStatements", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lso4/b;", "getInAppStatements", "startDate", "Lso4/a;", "getInAppStatement", "Lso4/c;", "getInAppStatementsWidget", "cycleId", "Lon4/n;", "getStatementBreakDown", "Lon4/c;", "getRates", "Lin4/a;", "activeCashback", "Lin4/b;", "cashbackPockets", "countryCode", "Lko4/a;", "productDetails", "actions", "Lsn4/a;", "getCreditCardDeeplinks", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgo4/a;", "getCreditCardPreferences", "getCreditForbearanceEligibility", "Lefm/d0;", "Lq90/i;", "getCreditForbearanceSurvey", "(Ljava/lang/String;)Lefm/d0;", b.Flow, "postCreditForbearanceSurvey", "(Ljava/lang/String;Lq90/i;)Lefm/d0;", "postCreditRc2FtcApply", "()Lefm/d0;", "Lrx4/b;", "getCreditAgreementsList", "getForbearanceAgreements", "Lyn4/s;", "getInstalmentsAvailability", "", "amount", "transactionIds", "Lyn4/b0;", "getInstalmentsQuote", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lao4/a;", "Lyn4/v;", "createInstalment", "(Ljava/lang/String;Lao4/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/a0;", "getInstalmentPlans", "planId", "Lyn4/z;", "getPostPurchaseInstalmentPlanDetails", "repayInstalment", "cancelInstalment", "currency", "Lyn4/w;", "customAmountQuote", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/c0;", "body", "repayCustomAmount", "(Ljava/lang/String;Ljava/lang/String;Lyn4/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/y;", "futureInstalmentsQuote", "Lyn4/d0;", "repayFutureInstalments", "(Ljava/lang/String;Ljava/lang/String;Lyn4/d0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/q;", "anticipationQuote", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/n;", "anticipateInstalment", "(Ljava/lang/String;Ljava/lang/String;Lyn4/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/t;", "getChangeTermQuote", "Lyn4/u;", "changeInstalmentTerm", "(Ljava/lang/String;Ljava/lang/String;Lyn4/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/f0;", "getStatementDeferralAvailability", "downPayment", "Lyn4/h0;", "getStatementDeferralQuotes", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/a;", "createStatementDeferral", "(Ljava/lang/String;Lyn4/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyn4/g0;", "getStatementDeferralPlan", "Lyn4/e0;", "getPrePurchasePlan", "Lyn4/b;", "getDebitToInstalmentsAvailability", "getDebitToInstalmentsQuote", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfn4/b;", "boletoEligibility", "Lfn4/c;", "idempotencyKey", "Lfn4/a;", "createBoleto", "(Ljava/lang/String;Lfn4/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boletos", "boletoId", "boleto", "deleteBoleto", "idempotencyId", "Lqo4/b;", "securityDepositTopUp", "(Ljava/lang/String;Ljava/lang/String;Lqo4/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqo4/c;", "securityDepositWithdraw", "(Ljava/lang/String;Ljava/lang/String;Lqo4/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqo4/a;", "getSecurityDeposit", "Len4/g;", "getAdditionalCardholders", "Len4/a;", "getAdditionalCardholderAccountInfo", "Len4/f;", "getAdditionalCardholdersDetails", "cardholderId", "Len4/d;", "getAdditionalCardholderSettings", "Len4/e;", "additionalCardholderSettingsRequestDto", "updateAdditionalCardholderSettings", "(Ljava/lang/String;Ljava/lang/String;Len4/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Len4/b;", "getAdditionalCardholderCards", "removeCreditCardAccessForAdditionalCardholder", "removeSelfFromCreditCardAdditionalAccess", "sourcePocketId", "Lhn4/a;", "checkCancellationEligibility", "Lhn4/b;", "getCancellationConfig", "Lhn4/g;", "Lhn4/h;", "deactivateCreditCard", "(Ljava/lang/String;Lhn4/g;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lun4/a;", "getFeeWaiverProgress", "Lmn4/a;", "creditLimitDecreaseDormancyAcceptance", "Lmn4/b;", "creditLimitDecreasePreOffer", "Lro4/d;", "creditCardSettings", "Lro4/a;", "changeRepaymentPreference", "(Ljava/lang/String;Lro4/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkn4/a;", "getCreditLimitCap", "newCap", "Lkn4/b;", "getCreditLimitCapImpact", "Lkn4/d;", "setCreditLimitCap", "(Ljava/lang/String;Lkn4/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmo4/d;", "getRepaymentReview", "Llo4/a;", "getRepaymentDetails", "Lpo4/a;", "validateRepaymentAmount", "Loo4/c;", "Lmo4/c;", "executeRepayment", "(Ljava/lang/String;Ljava/lang/String;Loo4/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "balanceDisplay", "Lvn4/a;", "getHomeHeaderContent", "Luo4/a;", "getStatementBottomSheetContent", "Lxn4/b;", "getInfoSectionsContent", "sectionId", "Lxn4/a;", "getInfoSectionDetailsContent", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardService {
    @GET("/credit/{facilityId}/rewards/active")
    Object activeCashback(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @POST("/credit/{facilityId}/instalments/{planId}/anticipation")
    Object anticipateInstalment(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @Body @NotNull n nVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/credit/{facilityId}/instalments/{planId}/anticipation/quote")
    Object anticipationQuote(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull @Query("type") String str3, @NotNull Continuation<? super q> continuation);

    @GET("/credit/{facilityId}/boletos/{id}")
    Object boleto(@Path("facilityId") @NotNull String str, @Path("id") @NotNull String str2, @NotNull Continuation<? super fn4.a> continuation);

    @GET("/credit/{facilityId}/boletos/eligibility")
    Object boletoEligibility(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super fn4.b> continuation);

    @GET("/credit/{facilityId}/boletos")
    Object boletos(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super List<fn4.a>> continuation);

    @PUT("/credit/{facilityId}/instalments/{planId}/cancel")
    Object cancelInstalment(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @GET("/credit/{facilityId}/cashback/pockets")
    Object cashbackPockets(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super List<in4.b>> continuation);

    @POST("/credit/{facilityId}/instalments/{planId}/change-term")
    Object changeInstalmentTerm(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @Body @NotNull u uVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("/credit/{facilityId}/repayment-preference")
    Object changeRepaymentPreference(@Path("facilityId") @NotNull String str, @Body @NotNull ro4.a aVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/credit/{facilityId}/deactivation/eligibility")
    Object checkCancellationEligibility(@Path("facilityId") @NotNull String str, @Query("sourcePocketId") String str2, @NotNull Continuation<? super hn4.a> continuation);

    @POST("/credit/{facilityId}/boletos")
    Object createBoleto(@Path("facilityId") @NotNull String str, @Body @NotNull c cVar, @Header("X-Idempotency-Key") String str2, @NotNull Continuation<? super fn4.a> continuation);

    @POST("/credit/{facilityId}/instalments")
    Object createInstalment(@Path("facilityId") @NotNull String str, @Body @NotNull ao4.a aVar, @NotNull Continuation<? super v> continuation);

    @POST("/credit/{facilityId}/instalments/statement-deferral")
    Object createStatementDeferral(@Path("facilityId") @NotNull String str, @Body @NotNull yn4.a aVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/credit/{facilityId}/settings")
    Object creditCardSettings(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super List<? extends d>> continuation);

    @PUT("/credit/{facilityId}/credit-limit-decrease/dormancy-acceptance")
    Object creditLimitDecreaseDormancyAcceptance(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super mn4.a> continuation);

    @GET("/credit/{facilityId}/credit-limit-decrease/manual/pre-offer")
    Object creditLimitDecreasePreOffer(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super mn4.b> continuation);

    @GET("/credit/{facilityId}/instalments/{planId}/repay/custom-amount/quote")
    Object customAmountQuote(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @Query("amount") long j2, @NotNull @Query("currency") String str3, @NotNull Continuation<? super w> continuation);

    @POST("/credit/{facilityId}/deactivation")
    Object deactivateCreditCard(@Path("facilityId") @NotNull String str, @Body @NotNull g gVar, @Header("X-Idempotency-Key") String str2, @NotNull Continuation<? super h> continuation);

    @DELETE("/credit/{facilityId}/boletos/{id}")
    Object deleteBoleto(@Path("facilityId") @NotNull String str, @Path("id") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit/{facilityId}/topup-v2")
    Object executeRepayment(@Header("X-Idempotency-Key") @NotNull String str, @Path("facilityId") @NotNull String str2, @Body @NotNull oo4.c cVar, @NotNull Continuation<? super mo4.c> continuation);

    @GET("/credit/{facilityId}/instalments/{planId}/repay/future-instalments/quote")
    Object futureInstalmentsQuote(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull Continuation<? super y> continuation);

    @GET("/credit/{facilityId}/additional-cardholder")
    Object getAdditionalCardholderAccountInfo(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super en4.a> continuation);

    @GET("/credit/{facilityId}/additional-cardholders/{cardholderId}/cards")
    Object getAdditionalCardholderCards(@Path("facilityId") @NotNull String str, @Path("cardholderId") @NotNull String str2, @NotNull Continuation<? super List<en4.b>> continuation);

    @GET("/credit/{facilityId}/additional-cardholders/{cardholderId}/settings")
    Object getAdditionalCardholderSettings(@Path("facilityId") @NotNull String str, @Path("cardholderId") @NotNull String str2, @NotNull Continuation<? super en4.d> continuation);

    @GET("/credit/{facilityId}/additional-cardholders")
    Object getAdditionalCardholders(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super en4.g> continuation);

    @GET("/credit/{facilityId}/additional-cardholders/details")
    Object getAdditionalCardholdersDetails(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("/credit/{facilityId}/deactivation/config")
    Object getCancellationConfig(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super hn4.b> continuation);

    @GET("/credit/{facilityId}/instalments/{planId}/change-term/quote")
    Object getChangeTermQuote(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull Continuation<? super t> continuation);

    @GET("/credit-application/credit-facility-v2/{facilityId}/agreement")
    Object getCreditAgreementsList(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super rx4.b> continuation);

    @GET("/credit/{facilityId}/deeplinks-configuration")
    Object getCreditCardDeeplinks(@Path("facilityId") @NotNull String str, @NotNull @Query("actions") List<String> list, @NotNull Continuation<? super List<sn4.a>> continuation);

    @GET("/credit/{facilityId}/dialog")
    Object getCreditCardDialog(@Path("facilityId") @NotNull String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super io4.g> continuation);

    @GET("/credit/{facilityId}/features/{feature}")
    Object getCreditCardFeatureConfig(@Path("facilityId") @NotNull String str, @Path("feature") @NotNull String str2, @NotNull Continuation<? super k> continuation);

    @GET("/credit/{facilityId}/features")
    Object getCreditCardFeatures(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super List<on4.b>> continuation);

    @GET("/credit/{facilityId}/limits")
    Object getCreditCardLimits(@Path("facilityId") @NotNull String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super do4.a> continuation);

    @GET("/credit/{facilityId}/preferences")
    Object getCreditCardPreferences(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super go4.a> continuation);

    @GET("/credit/{facilityId}/forbearance-eligibility")
    Object getCreditForbearanceEligibility(@Path("facilityId") @NotNull String str, @NotNull Continuation<Object> continuation);

    @GET("/credit-application/credit-facility/{id}/forbearance/v2/apply")
    @NotNull
    d0<i> getCreditForbearanceSurvey(@Path("id") @NotNull String facilityId);

    @GET("/credit/{facilityId}/limit-cap")
    Object getCreditLimitCap(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super kn4.a> continuation);

    @GET("/credit/{facilityId}/limit-cap/additional-cardholders")
    Object getCreditLimitCapImpact(@Path("facilityId") @NotNull String str, @Query("newCap") long j2, @NotNull Continuation<? super kn4.b> continuation);

    @GET("/credit/{facilityId}/limit-history")
    Object getCreditLimitHistory(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super List<bo4.a>> continuation);

    @GET("/credit/{facilityId}/cycle")
    Object getCreditManagementInfo(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super rn4.c> continuation);

    @GET("/credit/{facilityId}/payment-info")
    Object getCreditPaymentInfo(@Path("facilityId") @NotNull String str, @Query("paymentOption") String str2, @NotNull Continuation<? super on4.h> continuation);

    @GET("/credit/{countryCode}/debit-to-instalments/availability")
    Object getDebitToInstalmentsAvailability(@Path("countryCode") @NotNull String str, @NotNull Continuation<? super yn4.b> continuation);

    @GET("/credit/{countryCode}/debit-to-instalments/quote")
    Object getDebitToInstalmentsQuote(@Path("countryCode") @NotNull String str, @Query("amount") long j2, @NotNull @Query("currency") String str2, @Query("transactionIds") String str3, @NotNull Continuation<? super List<b0>> continuation);

    @GET("/credit/{facilityId}/premium/fee-waiver/progress")
    Object getFeeWaiverProgress(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super un4.a> continuation);

    @GET("/credit-application/forbearance-loan-facility/{facilityId}/agreement")
    Object getForbearanceAgreements(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super rx4.b> continuation);

    @GET("/credit/{facilityId}/screen/home-header")
    Object getHomeHeaderContent(@Path("facilityId") @NotNull String str, @NotNull @Query("balanceDisplay") String str2, @NotNull Continuation<? super vn4.a> continuation);

    @GET("/credit/{facilityId}/in-app-statements/{startDate}")
    Object getInAppStatement(@Path("facilityId") @NotNull String str, @Path("startDate") @NotNull String str2, @NotNull Continuation<? super so4.a> continuation);

    @GET("/credit/{facilityId}/in-app-statements")
    Object getInAppStatements(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super List<so4.b>> continuation);

    @GET("/credit/{facilityId}/in-app-statements/widget")
    Object getInAppStatementsWidget(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super so4.c> continuation);

    @GET("/credit/{facilityId}/info/{sectionId}")
    Object getInfoSectionDetailsContent(@Path("facilityId") @NotNull String str, @Path("sectionId") @NotNull String str2, @NotNull Continuation<? super xn4.a> continuation);

    @GET("/credit/{facilityId}/info")
    Object getInfoSectionsContent(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super xn4.b> continuation);

    @GET("/credit/{facilityId}/instalments")
    Object getInstalmentPlans(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super List<a0>> continuation);

    @GET("/credit/{facilityId}/instalments/availability")
    Object getInstalmentsAvailability(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super s> continuation);

    @GET("/credit/{facilityId}/instalments/quote")
    Object getInstalmentsQuote(@Path("facilityId") @NotNull String str, @Query("amount") long j2, @Query("transactionIds") String str2, @NotNull Continuation<? super List<b0>> continuation);

    @GET("/credit/{facilityId}/instalments/{planId}")
    Object getPostPurchaseInstalmentPlanDetails(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull Continuation<? super z> continuation);

    @GET("/credit/{facilityId}/instalments/pre-purchase/{planId}")
    Object getPrePurchasePlan(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull Continuation<? super e0> continuation);

    @GET("/credit/{facilityId}/rates")
    Object getRates(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super on4.c> continuation);

    @GET("/credit/{facilityId}/repayment/details")
    Object getRepaymentDetails(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super lo4.a> continuation);

    @GET("/credit/{facilityId}/repayment/review")
    Object getRepaymentReview(@Path("facilityId") @NotNull String str, @Query("amount") long j2, @NotNull Continuation<? super mo4.d> continuation);

    @GET("/credit/{facilityId}/security-deposit")
    Object getSecurityDeposit(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super qo4.a> continuation);

    @GET("/credit/{facilityId}/screen/home-statement-bottom-sheet")
    Object getStatementBottomSheetContent(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super uo4.a> continuation);

    @GET("/credit/{facilityId}/cycle/{cycleId}/statement-breakdown")
    Object getStatementBreakDown(@Path("facilityId") @NotNull String str, @Path("cycleId") @NotNull String str2, @NotNull Continuation<? super on4.n> continuation);

    @GET("/credit/{facilityId}/instalments/statement-deferral/availability")
    Object getStatementDeferralAvailability(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super f0> continuation);

    @GET("/credit/{facilityId}/instalments/statement-deferral/{planId}")
    Object getStatementDeferralPlan(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull Continuation<? super g0> continuation);

    @GET("/credit/{facilityId}/instalments/statement-deferral/quote")
    Object getStatementDeferralQuotes(@Path("facilityId") @NotNull String str, @Query("downPayment") long j2, @NotNull Continuation<? super List<h0>> continuation);

    @GET("/credit/{facilityId}/v2/statements")
    Object getStatements(@Path("facilityId") @NotNull String str, @NotNull @Query("format") String str2, @Query("limit") Integer num, @NotNull Continuation<? super rn4.f> continuation);

    @GET("/credit/{facilityId}/transactions/{transactionId}/details")
    Object getTransactionDetails(@Path("facilityId") @NotNull String str, @Path("transactionId") @NotNull String str2, @NotNull Continuation<? super vo4.a> continuation);

    @POST("/credit/{facilityId}/link-card")
    Object linkCardToCredit(@Path("facilityId") @NotNull String str, @Body @NotNull dn4.a aVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit-application/credit-facility/{id}/forbearance/v2/apply")
    @NotNull
    d0<i> postCreditForbearanceSurvey(@Path("id") @NotNull String facilityId, @Body @NotNull i flow);

    @POST("/credit-application/credit-facility/forbearance/rc2ftc/apply")
    @NotNull
    d0<Object> postCreditRc2FtcApply();

    @GET("/credit/{countryCode}/product-details")
    Object productDetails(@Path("countryCode") @NotNull String str, @NotNull Continuation<? super ko4.a> continuation);

    @POST("/credit/{facilityId}/additional-cardholders/{cardholderId}/cancel")
    Object removeCreditCardAccessForAdditionalCardholder(@Path("facilityId") @NotNull String str, @Path("cardholderId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit/{facilityId}/additional-cardholder/cancel")
    Object removeSelfFromCreditCardAdditionalAccess(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit/{facilityId}/instalments/{planId}/repay/custom-amount")
    Object repayCustomAmount(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @Body @NotNull c0 c0Var, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit/{facilityId}/instalments/{planId}/repay/future-instalments")
    Object repayFutureInstalments(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @Body @NotNull yn4.d0 d0Var, @NotNull Continuation<? super Unit> continuation);

    @PUT("/credit/{facilityId}/instalments/{planId}/prepay")
    Object repayInstalment(@Path("facilityId") @NotNull String str, @Path("planId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit/{facilityId}/security-deposit/topup")
    Object securityDepositTopUp(@Header("X-Idempotency-Key") String str, @Path("facilityId") @NotNull String str2, @Body @NotNull qo4.b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit/{facilityId}/security-deposit/withdraw")
    Object securityDepositWithdraw(@Header("X-Idempotency-Key") String str, @Path("facilityId") @NotNull String str2, @Body @NotNull qo4.c cVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit/{facilityId}/limit-cap")
    Object setCreditLimitCap(@Path("facilityId") @NotNull String str, @Body @NotNull kn4.d dVar, @NotNull Continuation<? super kn4.a> continuation);

    @POST("/credit/topup")
    Object topupCredit(@Body @NotNull qn4.a aVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("/credit/{facilityId}/additional-cardholders/{cardholderId}/settings")
    Object updateAdditionalCardholderSettings(@Path("facilityId") @NotNull String str, @Path("cardholderId") @NotNull String str2, @Body @NotNull e eVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/credit/{facilityId}/repayment/validate")
    Object validateRepaymentAmount(@Path("facilityId") @NotNull String str, @Query("amount") long j2, @NotNull Continuation<? super po4.a> continuation);
}
