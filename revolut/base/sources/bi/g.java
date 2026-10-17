package bi;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends qy5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i) {
        super(4);
        this.f15352b = i;
    }

    @Override // qy5.a, bi.b
    public void g(c cVar) {
        switch (this.f15352b) {
            case 1:
                StringBuilder sb6 = new StringBuilder();
                while (true) {
                    if (cVar.b()) {
                        char cA = cVar.a();
                        cVar.d++;
                        j(cA, sb6);
                        if (sb6.length() % 3 == 0) {
                            qy5.a.s(cVar, sb6);
                            if (ksj.b.t(cVar.f15340a, cVar.d, 3) != 3) {
                                cVar.e = 0;
                            }
                        }
                    }
                }
                m(cVar, sb6);
                break;
            default:
                super.g(cVar);
                break;
        }
    }

    @Override // qy5.a
    public final int j(char c2, StringBuilder sb6) {
        switch (this.f15352b) {
            case 0:
                if (c2 == ' ') {
                    sb6.append((char) 3);
                    return 1;
                }
                if (c2 >= '0' && c2 <= '9') {
                    sb6.append((char) (c2 - ','));
                    return 1;
                }
                if (c2 >= 'a' && c2 <= 'z') {
                    sb6.append((char) (c2 - 'S'));
                    return 1;
                }
                if (c2 < ' ') {
                    sb6.append((char) 0);
                    sb6.append(c2);
                } else if (c2 >= '!' && c2 <= '/') {
                    sb6.append((char) 1);
                    sb6.append((char) (c2 - '!'));
                } else if (c2 >= ':' && c2 <= '@') {
                    sb6.append((char) 1);
                    sb6.append((char) (c2 - '+'));
                } else if (c2 >= '[' && c2 <= '_') {
                    sb6.append((char) 1);
                    sb6.append((char) (c2 - 'E'));
                } else if (c2 == '`') {
                    sb6.append((char) 2);
                    sb6.append((char) (c2 - '`'));
                } else if (c2 >= 'A' && c2 <= 'Z') {
                    sb6.append((char) 2);
                    sb6.append((char) (c2 - '@'));
                } else {
                    if (c2 < '{' || c2 > 127) {
                        sb6.append("\u0001\u001e");
                        return j((char) (c2 - 128), sb6) + 2;
                    }
                    sb6.append((char) 2);
                    sb6.append((char) (c2 - '`'));
                }
                return 2;
            default:
                if (c2 == '\r') {
                    sb6.append((char) 0);
                } else if (c2 == ' ') {
                    sb6.append((char) 3);
                } else if (c2 == '*') {
                    sb6.append((char) 1);
                } else if (c2 == '>') {
                    sb6.append((char) 2);
                } else if (c2 >= '0' && c2 <= '9') {
                    sb6.append((char) (c2 - ','));
                } else {
                    if (c2 < 'A' || c2 > 'Z') {
                        ksj.b.n(c2);
                        throw null;
                    }
                    sb6.append((char) (c2 - '3'));
                }
                return 1;
        }
    }

    @Override // qy5.a
    public final int k() {
        switch (this.f15352b) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // qy5.a
    public void m(c cVar, StringBuilder sb6) {
        switch (this.f15352b) {
            case 1:
                StringBuilder sb9 = cVar.f15342c;
                cVar.c(sb9.length());
                int length = cVar.f.f15348b - sb9.length();
                cVar.d -= sb6.length();
                String str = cVar.f15340a;
                if ((str.length() - cVar.f15343g) - cVar.d > 1 || length > 1 || (str.length() - cVar.f15343g) - cVar.d != length) {
                    cVar.d((char) 254);
                }
                if (cVar.e < 0) {
                    cVar.e = 0;
                }
                break;
            default:
                super.m(cVar, sb6);
                break;
        }
    }
}
